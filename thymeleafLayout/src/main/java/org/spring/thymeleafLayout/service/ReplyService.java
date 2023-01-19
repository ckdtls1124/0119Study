package org.spring.thymeleafLayout.service;

import lombok.RequiredArgsConstructor;
import org.spring.thymeleafLayout.dto.ReplyDto;
import org.spring.thymeleafLayout.entity.ReplyEntity;
import org.spring.thymeleafLayout.repository.ReplyRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ReplyService {
    private final ReplyRepo replyRepo;

//    Insert
    public void writeComment(ReplyDto dto) {
        ReplyEntity entity=ReplyDto.ReplyDtoReq.toEntity(dto);
        replyRepo.save(entity);
    }

    public List<ReplyDto> showComments() {
        List<ReplyEntity> entities=replyRepo.findAll();
        List<ReplyDto> dto=new ArrayList<>();
        for(ReplyEntity i:entities){
            dto.add(ReplyDto.ReplyDtoResp.toDto(i));
        }
        return dto;
    }
}
