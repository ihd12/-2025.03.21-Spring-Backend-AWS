package org.zerock.todoapp.member.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.todoapp.member.dto.MemberDTO;
import org.zerock.todoapp.member.service.MemberService;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/join")
    public String joinMember() {
        return "member/join";
    }
    @PostMapping("/join")
    public String joinMember(MemberDTO dto){
        memberService.joinMember(dto);
        return "redirect:/member/login";
    }
    @GetMapping("/login")
    public String login() {
        return "member/login";
    }
    @PostMapping("/login")
    public String login(MemberDTO dto, HttpSession session){
        MemberDTO result = memberService.loginMemeber(dto);
        session.setAttribute("UserId", result.getId());
        session.setAttribute("UserDTO", result);
        return "redirect:/todo/list";
    }
    @GetMapping("/remove")
    public String removeMember() {
        return "member/remove";
    }
    @PostMapping("/remove")
    public String removeMember(MemberDTO dto, HttpSession session){
        memberService.removeMember(dto);
        return "redirect:/member/logout";
    }
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/todo/list";
    }
}
