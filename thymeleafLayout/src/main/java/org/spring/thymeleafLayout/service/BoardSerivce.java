package org.spring.thymeleafLayout.service;

import lombok.RequiredArgsConstructor;
import org.spring.thymeleafLayout.dto.BoardDto;
import org.spring.thymeleafLayout.entity.BoardEntity;
import org.spring.thymeleafLayout.repository.BoardRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BoardSerivce {
    private final BoardRepo boardRepo;

    public void insertBoard(BoardDto dto) {
        BoardEntity entity=BoardDto.BoardDtoReq.toEntity(dto);
        boardRepo.save(entity);
    }

    public List<BoardDto> findAllLists() {
        List<BoardEntity> entities=boardRepo.findAll();
        List<BoardDto> dto=new ArrayList<>();
        for(BoardEntity i:entities){
            dto.add(BoardDto.BoardDtoResp.toDTO(i));
        }
        return dto;
    }

    public BoardDto findById(Long number) {
        Optional<BoardEntity> entity=boardRepo.findById(number);
        if(entity.isPresent()){
            BoardDto dto=BoardDto.BoardDtoResp.toDTO(entity.get());
            return dto;
        } else {
            return null;
        }
    }
}
