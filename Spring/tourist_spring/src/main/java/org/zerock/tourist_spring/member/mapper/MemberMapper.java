package org.zerock.tourist_spring.member.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.zerock.tourist_spring.member.vo.MemberVO;

public interface MemberMapper {
    String getTime();
    void insertMember(MemberVO memberVO);
}
