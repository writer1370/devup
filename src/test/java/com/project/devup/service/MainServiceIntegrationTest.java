package com.project.devup.service;

import com.project.devup.entity.Menu;
import com.project.devup.repository.MainRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MainServiceIntegrationTest {
    @Autowired MainService mainService;
    @Autowired MainRepository mainRepository;

    @Test
    public void 메뉴조회() throws Exception {
        //given
        String authId = "MEMBER";

        //when
        List<Menu> topMenu = mainService.getTopMenu(authId);

        //then
        Assertions.assertThat(topMenu.size()).isEqualTo(3);
    }
}
