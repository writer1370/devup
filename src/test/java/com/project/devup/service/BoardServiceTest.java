package com.project.devup.service;

import com.project.devup.entity.Board;
import com.project.devup.repository.BoardRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class BoardServiceTest {
    @Autowired
    BoardService boardService;
    @Autowired
    BoardRepository boardRepository;

    @Test
    public void 메뉴기준목록조회() throws Exception {
        //given
        String menuUrl = "school";

        //when
        List<Board> result = boardService.findAllByMenuUrl(menuUrl);

        //then
        Assertions.assertThat(result.size()).isEqualTo(4);
    }

    @Test
    public void 카테고리기준목록조회() throws Exception {
        //given
        String menuUrl = "school";
        String category = "study";

        //when
        List<Board> result = boardService.findAllByCategory(menuUrl,category);

        //then
        Assertions.assertThat(result.size()).isEqualTo(3);
    }
}
