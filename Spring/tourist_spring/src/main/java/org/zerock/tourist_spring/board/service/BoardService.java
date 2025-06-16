package org.zerock.tourist_spring.board.service;

import org.zerock.tourist_spring.board.dto.BoardDTO;

import java.util.List;

public interface BoardService {
    List<BoardDTO> findAll();
    BoardDTO findOne(int num);
    void removeBoard(int num);
    void editBoard(BoardDTO boardDTO);
    BoardDTO findOneEdit(int num);
}
