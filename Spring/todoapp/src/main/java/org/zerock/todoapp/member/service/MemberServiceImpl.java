package org.zerock.todoapp.member.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.zerock.todoapp.member.dto.MemberDTO;
import org.zerock.todoapp.member.mapper.MemberMapper;
import org.zerock.todoapp.member.vo.MemberVO;

@Service
@Log4j2
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    private final MemberMapper memberMapper;
    @Override
    public void joinMember(MemberDTO dto) {
        MemberVO vo = MemberVO.builder()
                .id(dto.getId())
                .pw(dto.getPw())
                .email1(dto.getEmail1())
                .email2(dto.getEmail2())
                .build();
        memberMapper.insertMember(vo);
    }
    @Override
    public MemberDTO loginMemeber(MemberDTO dto) {
        MemberVO vo = MemberVO.builder()
                .id(dto.getId())
                .pw(dto.getPw())
                .build();
        MemberVO resultVO = memberMapper.loginMember(vo);
        MemberDTO resultDTO = MemberDTO.builder()
                .id(resultVO.getId())
                .pw(resultVO.getPw())
                .email1(resultVO.getEmail1())
                .email2(resultVO.getEmail2())
                .build();
        return resultDTO;
    }
    @Override
    public void removeMember(MemberDTO dto) {
        MemberVO vo = MemberVO.builder()
                .id(dto.getId())
                .pw(dto.getPw())
                .build();
        memberMapper.deleteMember(vo);
    }
}















