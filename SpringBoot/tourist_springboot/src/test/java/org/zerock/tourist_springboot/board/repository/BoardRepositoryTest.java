package org.zerock.tourist_springboot.board.repository;

import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.tourist_springboot.board.domain.Board;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BoardRepositoryTest {
    @Autowired
    private BoardRepository boardRepository;

    @Test
    @Transactional
    public void updateVisitCount(){
        Board vo = boardRepository.save(Board.builder()
                .num(1L)
                        .title("title")
                        .content("content")
                        .id("hong")
                        .visitCount(0)
                .build());
        System.out.println(vo);
        boardRepository.updateVisitCount(1L);
        Board vo2 =  boardRepository.findById(1L).get();
        System.out.println(vo2);
    }
    @Test
    @Transactional
    public void updateVisitCount2(){
        Board vo = boardRepository.save(Board.builder()
                .title("title")
                .content("content")
                .id("hong")
                .visitCount(0)
                .build());
        System.out.println(vo);
        vo.updateVisitCount();
        System.out.println(vo);
    }
}