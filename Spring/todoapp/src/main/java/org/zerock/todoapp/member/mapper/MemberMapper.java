package org.zerock.todoapp.member.mapper;

import org.zerock.todoapp.member.vo.MemberVO;

public interface MemberMapper {
    void insertMember(MemberVO vo);
    MemberVO loginMember(MemberVO vo);
    void deleteMember(MemberVO vo);
}
