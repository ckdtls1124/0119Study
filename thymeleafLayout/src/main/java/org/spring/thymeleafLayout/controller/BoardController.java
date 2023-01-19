package org.spring.thymeleafLayout.controller;

import lombok.RequiredArgsConstructor;
import org.spring.thymeleafLayout.dto.BoardDto;
import org.spring.thymeleafLayout.service.BoardSerivce;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {

    private final BoardSerivce boardSerivce;
    @GetMapping("/writePage")
    public String showWritePage(){
        return "pages/board/board_index";
    }

    @PostMapping("/writeDo")
    public String writeBoard(@ModelAttribute BoardDto dto){
        boardSerivce.insertBoard(dto);
            return "redirect : showAll";
    }

    @PostMapping("/showAll")
    public String showAll(Model model){
        List<BoardDto> result=boardSerivce.findAllLists();
        model.addAttribute("result", result);
        return "pages/board/boardAllList";
    }


    @GetMapping("/comment")
    public String commentBoard(){
        return "";
    }

}
