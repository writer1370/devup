package com.project.devup.service;

import com.project.devup.entity.Menu;
import com.project.devup.repository.MainRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService {
    private final MainRepository mainRepository;
    public MainService(MainRepository mainRepository) {
        this.mainRepository = mainRepository;
    }

    public List<Menu> findMenu(String authId) {
        return mainRepository.findMenu(authId);
    }
}
