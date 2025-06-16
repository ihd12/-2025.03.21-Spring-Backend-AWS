package org.zerock.tourist_spring.board.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.tourist_spring.board.dto.BoardDTO;
import org.zerock.tourist_spring.board.mapper.BoardMapper;
import org.zerock.tourist_spring.board.service.BoardService;

import javax.servlet.http.HttpSession;

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
    @GetMapping("/edit")
    public String getBoardEdit(int num, Model model){
        model.addAttribute("dto", boardService.findOneEdit(num));
        return "edit";
    }
    @PostMapping("/edit")
    public String editBoard(BoardDTO boardDTO,
                            RedirectAttributes redirectAttributes,
                            HttpSession session){
        String userId = session.getAttribute("UserId").toString();
        return "";
    }
    @PostMapping("/remove")
    public String postBoardRemove(int num,
                                  HttpSession session,
                                  RedirectAttributes redirectAttributes){
        // 로그인한 계정의 ID 저장
        String userId = session.getAttribute("UserId").toString();
        // 게시글 정보 저장
        BoardDTO boardDTO = boardService.findOneEdit(num);
        // 게시글 작성자와 로그인 ID를 비교
        if(boardDTO.getId().equals(userId)){
            // ID와 작성자가 일치할 경우 게시글을 삭제하고
            boardService.removeBoard(num);
            // list화면을 출력
            return "redirect:/board/list";
        }else{
            // 로그인ID와 게시글 작성자가 일치하지 않으면 상세보기 화면을 출력
            redirectAttributes.addAttribute("num",num);
            return "redirect:/board/read";
        }
    }
}
