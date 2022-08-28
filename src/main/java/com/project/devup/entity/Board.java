package com.project.devup.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Board {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long boardId;

    private String userId;
    private String title;
    private String category;
    private String content;
    private LocalDateTime regDate;
    private LocalDateTime updDate;
    private String menuUrl;
}

