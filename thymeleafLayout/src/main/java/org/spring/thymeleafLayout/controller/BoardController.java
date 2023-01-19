package org.spring.thymeleafLayout.controller;

import lombok.RequiredArgsConstructor;
import org.spring.thymeleafLayout.dto.BoardDto;
import org.spring.thymeleafLayout.service.BoardSerivce;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {

    private final BoardSerivce boardSerivce;

    @GetMapping("/page")
    public String showWritePage(){
        return "pages/board/board_index";
    }

//    Insert
    @PostMapping("/write")
    public String writeBoard(@ModelAttribute BoardDto dto){
        boardSerivce.insertBoard(dto);
            return "redirect:showAll";
    }
//    Select All
    @GetMapping("/showAll")
    public String showAll(Model model){
        List<BoardDto> result=boardSerivce.findAllLists();
        model.addAttribute("result", result);
        return "pages/board/boardAllList";
    }

//    Select where Id
    @GetMapping("/selectId/{board_id}")
    public String showWhereId(@PathVariable Long board_id, Model model){
        BoardDto dto=boardSerivce.findById(board_id);
        model.addAttribute("each", dto);
        return "pages/board/boardOne";
    }

//    Show all replies by AJAX
//    @PostMapping("showComments")



}
