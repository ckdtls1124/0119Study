package org.spring.thymeleafLayout.controller;

import lombok.RequiredArgsConstructor;
import org.spring.thymeleafLayout.dto.ReplyDto;
import org.spring.thymeleafLayout.service.ReplyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/reply")
@RequiredArgsConstructor
public class ReplyController {

    private final ReplyService replyService;


//    Insert
    @PostMapping("/write")
    public void commentWrite(@ModelAttribute ReplyDto dto){
        replyService.writeComment(dto);
    }

    @PostMapping("/showComments")
    public @ResponseBody List<ReplyDto> showComments(){
        List<ReplyDto> dtos=replyService.showComments();
        return dtos;
    }



}
