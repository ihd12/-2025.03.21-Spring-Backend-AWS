package org.zerock.todoapp.member.service;

import org.zerock.todoapp.member.dto.MemberDTO;

public interface MemberService {
    void joinMember(MemberDTO dto);
    MemberDTO loginMemeber(MemberDTO dto);
    void removeMember(MemberDTO dto);
}
