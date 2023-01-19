package org.spring.thymeleafLayout.dto;

import lombok.*;
import org.spring.thymeleafLayout.entity.BoardEntity;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class BoardDto {


    private Long board_id;
    private String board_pw;
    private String content;
    private int hit=0;
    private String title;
    private String writer;
    private Date create_time;
    private Date update_time;

    public static class BoardDtoReq{
        public static BoardEntity toEntity(BoardDto dto){
            BoardEntity entity=new BoardEntity();
//            entity.setBoard_id(dto.getBoard_id());
            entity.setBoard_pw(dto.getBoard_pw());
            entity.setContent(dto.getContent());
            entity.setHit(dto.getHit());
            entity.setTitle(dto.getTitle());
            entity.setWriter(dto.getWriter());
            entity.setCreate_time(dto.getCreate_time());
            entity.setUpdate_time(dto.getUpdate_time());
            return entity;
        }
    }

    public static class BoardDtoResp{
        public static BoardDto toDTO(BoardEntity entity){
            BoardDto dto=new BoardDto();
            dto.setBoard_id(entity.getBoard_id());
            dto.setBoard_pw(entity.getBoard_pw());
            dto.setContent(entity.getContent());
            dto.setHit(entity.getHit());
            dto.setTitle(entity.getTitle());
            dto.setWriter(entity.getWriter());
            dto.setCreate_time(entity.getCreate_time());
            dto.setUpdate_time(entity.getUpdate_time());
            return dto;
        }
    }

}
