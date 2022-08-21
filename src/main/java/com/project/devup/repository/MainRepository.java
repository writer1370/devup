package com.project.devup.repository;

import com.project.devup.entity.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface MainRepository {
    List<Menu> getTopMenu(String authId);
}
