package org.zerock.tourist_spring.board.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.zerock.tourist_spring.board.dto.BoardDTO;
import org.zerock.tourist_spring.board.mapper.BoardMapper;
import org.zerock.tourist_spring.board.vo.BoardVO;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Log4j2
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
    private final BoardMapper boardMapper;

    @Override
    public List<BoardDTO> findAll() {
        List<BoardDTO> dtoList = boardMapper.selectAll().stream()
                .map(vo-> BoardDTO.builder()
                        .num(vo.getNum())
                        .title(vo.getTitle())
                        .content(vo.getContent())
                        .id(vo.getId())
                        .postdate(vo.getPostdate())
                        .visitcount(vo.getVisitcount())
                        .build()
                )
                .collect(Collectors.toList());
        return dtoList;
    }
    public BoardDTO findOne(int num){
        // 조회수 증가 SQL실행
        boardMapper.updateVisitCount(num);
        BoardVO vo = boardMapper.selectOne(num);
        BoardDTO dto = BoardDTO.builder()
                .num(vo.getNum())
                .title(vo.getTitle())
                // 모든 엔터키를 <br/> 태그로 변경
                .content(vo.getContent().replaceAll("(\r\n|\r|\n)","<br/>"))
                .id(vo.getId())
                .postdate(vo.getPostdate())
                .visitcount(vo.getVisitcount())
                .build();
        return dto;
    }
}
