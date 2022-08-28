package com.project.devup.service;

import com.project.devup.entity.Board;
import com.project.devup.repository.BoardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    private final BoardRepository boardRepository;
    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public List<Board> findAllByMenuUrl(String menuUrl) {
        return boardRepository.findAllByMenuUrl(menuUrl);
    }

    public List<Board> findAllByCategory(String menuUrl, String category) {
        return boardRepository.findAllByCategory(menuUrl,category);
    }
}
