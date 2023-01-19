package org.spring.thymeleafLayout.dto;

import lombok.*;
import org.spring.thymeleafLayout.entity.ReplyEntity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class ReplyDto {

    private Long id;
    private Date create_date;
    private String comments;
    private Date update_date;
    private String reply_writer;
    private Long board_id;

    public static class ReplyDtoReq {

        public static ReplyEntity toEntity(ReplyDto dto) {
            ReplyEntity entity = new ReplyEntity();
            entity.setId(dto.getId());
            entity.setReply_writer(dto.getReply_writer());
            entity.setComments(dto.getComments());
            entity.setCreate_date(dto.getCreate_date());
            entity.setUpdate_date(dto.getUpdate_date());
            return entity;
        }


    }

    public static class ReplyDtoResp {
        public static ReplyDto toDto(ReplyEntity entity) {
            ReplyDto dto = new ReplyDto();
            dto.setId(entity.getId());
            dto.setReply_writer(entity.getReply_writer());
            dto.setComments(entity.getComments());
            dto.setCreate_date(entity.getCreate_date());
            dto.setUpdate_date(entity.getUpdate_date());
            return dto;
        }

    }


}
