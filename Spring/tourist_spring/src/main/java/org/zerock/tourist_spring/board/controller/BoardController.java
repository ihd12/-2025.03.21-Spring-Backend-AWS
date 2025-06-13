package org.zerock.tourist_spring.board.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.tourist_spring.board.mapper.BoardMapper;
import org.zerock.tourist_spring.board.service.BoardService;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {
    private final BoardService boardService;
    @GetMapping("/list")
    public String getBoardList(Model model){
        model.addAttribute("boardLists", boardService.findAll());
        return "list";
    }
    @GetMapping("/read")
    public String getBoardRead(int num, Model model){
        model.addAttribute("dto", boardService.findOne(num));
        return "read";
    }
}
