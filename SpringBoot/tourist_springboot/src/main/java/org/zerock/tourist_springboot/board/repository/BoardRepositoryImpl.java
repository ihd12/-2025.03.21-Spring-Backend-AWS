package org.zerock.tourist_springboot.board.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Repository;
import org.zerock.tourist_springboot.board.domain.Board;
import org.zerock.tourist_springboot.board.dto.BoardDTO;
import org.zerock.tourist_springboot.common.dto.PageRequestDTO;
import org.zerock.tourist_springboot.common.dto.PageResponseDTO;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class BoardRepositoryImpl implements BoardRepositoryCustom {
    @PersistenceContext
    private EntityManager em;

    @Override
    public PageResponseDTO<BoardDTO> search(PageRequestDTO pageRequestDTO) {
        Pageable pageable = PageRequest.of(
                pageRequestDTO.getPage()-1 // 페이지 번호
                ,pageRequestDTO.getSize() // 페이지 사이즈
                , Sort.by("num").descending());// 정렬방식
        String sql = "SELECT b FROM Board b";
        String keyword = pageRequestDTO.getKeyword();
        if(keyword!=null && !keyword.isEmpty()){
            sql+=" WHERE b.title LIKE '%"+keyword+"%'";
        }
        sql += " ORDER BY b.num DESC";
        TypedQuery<Board> query = em.createQuery(sql, Board.class);
        int totalCount = query.getResultList().size();
        query.setFirstResult((int)pageable.getOffset());
        query.setMaxResults((int)pageable.getPageSize());
        List<BoardDTO> dtoList = query.getResultList().stream().map(BoardDTO::new).toList();
        return PageResponseDTO.<BoardDTO>withAll()
                .pageRequestDTO(pageRequestDTO)
                .dtoList(dtoList)
                .total(totalCount)
                .build();
    }
}
