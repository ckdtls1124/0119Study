$('#writeDo').on('click', commentSuccess)

function commentSuccess(){
       const data={
            'comments':$('#comments').val(),
            'reply_writer':$('#reply_writer').val()
        }
        $.ajax({
            type: 'post',
            data: data,
            url: '/reply/write'
            });
    alert('덧글 작성이 완료되었습니다.')
}

$('#showComments').on('click', showAllComments)

function showAllComments(){
    $.ajax({
        type: 'post',
        url: '/reply/showComments',
        success: function(res){
            let tag='';
            const rs=res;
            rs.forEach(function(el, idx){
                tag=tag+"<tr>";
                    tag=tag+"<td>"+el.comments+"</td>";
                    tag=tag+"<td>"+el.reply_writer+"</td>";
                tag=tag+"</tr>"
            })
            $('#commentsSec tbody').html(tag);
           }

    })
}