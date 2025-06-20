package org.zerock.todoapp.member.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor // 기본 생성자 생성 public TodoDTO(){}
@AllArgsConstructor // 모든 데이터를 저장하는 생성자 생성
@Builder // TodoDTO생성에 사용하는 메서드 생성
public class MemberDTO {
    private String id;
    private String pw;
    private String email1;
    private String email2;
    private LocalDate regdate;
}
