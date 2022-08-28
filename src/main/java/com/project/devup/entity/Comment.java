package com.project.devup.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

public class Comment {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentId;

    private Long boardId;
    private String userId;
    private String comment;
    private Long depth;
    private Long order;
    private Long groupNum;
    private LocalDateTime regDate;
    private LocalDateTime updDate;
    private String useYn;
}

