package com.project.devup.service;

import com.project.devup.entity.Menu;
import com.project.devup.repository.MainRepositoryJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService {
    @Autowired
    MainRepositoryJpa mainRepositoryJpa;

    public List<Menu> getTopMenu(String authId) {
        return mainRepositoryJpa.getTopMenu(authId);
    }
}
