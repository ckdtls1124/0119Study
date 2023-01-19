use springbootdb;
show tables;

-- boardTable
desc board_table;
select * from board_table;

insert into board_table(title, content, board_pw, writer) values('title1', 'content1', 'password1', 'writer1');  
insert into board_table(title, content, board_pw, writer) values('title2', 'content2', 'password1', 'writer1');  
insert into board_table(title, content, board_pw, writer) values('title3', 'content3', 'password1', 'writer2');  
insert into board_table(title, content, board_pw, writer) values('title4', 'content4', 'password1', 'writer3');  
insert into board_table(title, content, board_pw, writer) values('title5', 'content5', 'password1', 'writer1');  


-- ajaxTable
desc ajax_table;
select * from ajax_table;
drop table ajax_table;




--  board_jpa_tb2
 create table board_jpa_tb2 (
       board_id bigint not null auto_increment,
        board_pw varchar(255) not null,
        content varchar(500) not null,
        create_time datetime(6),
        hit integer default 0 not null,
        title varchar(255) not null,
        update_time datetime(6),
        writer varchar(255) not null,
        primary key (board_id)
    ) ;
    desc board_jpa_tb;
    
    
    
    
    
    
    -- reply_jpa_tb2
    drop table reply_jpa_tb2;
        create table reply_jpa_tb2 (
       id bigint not null auto_increment,
        create_date datetime(6),
        reply_contents varchar(255),
        reply_writer varchar(20) not null,
        update_date datetime(6),
        board_id bigint not null,
        primary key (id),
		foreign key (board_id)
		references board_jpa_tb2 (board_id)
    ) ;
    desc reply_jpa_tb2;

    