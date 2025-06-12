package org.zerock.tourist_spring.member.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.zerock.tourist_spring.member.dto.MemberDTO;
import org.zerock.tourist_spring.member.mapper.MemberMapper;
import org.zerock.tourist_spring.member.vo.MemberVO;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    private final MemberMapper memberMapper;
    public void addMember(MemberDTO memberDTO){
        MemberVO vo = MemberVO.builder()
                .id(memberDTO.getId())
                .name(memberDTO.getName())
                .email(memberDTO.getEmail())
                .password(memberDTO.getPassword())
                .phone(memberDTO.getPhone())
                .gender(memberDTO.getGender())
                .agree(memberDTO.isAgree())
                .content(memberDTO.getContent())
                .build();
        memberMapper.insertMember(vo);
    }
}
