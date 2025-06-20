package org.zerock.springex2.vo;

import lombok.*;

import java.time.LocalDate;

@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberVO {
    private String id;
    private String pw;
    private String email1;
    private String email2;
    private LocalDate regdate;
}
