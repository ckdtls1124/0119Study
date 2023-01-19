package org.spring.thymeleafLayout.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class thymeleafController {

    @GetMapping("/board")
    public String board(){
        return "pages/board/board_index";
    }
    @GetMapping("/admin")
    public String main(){
        return "pages/admin/admin_index";
    }

}
