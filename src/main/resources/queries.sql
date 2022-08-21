/*메뉴테이블 생성*/
CREATE TABLE `devup`.`menu`
(
    `MENU_ID` VARCHAR(50) NOT NULL COMMENT '메뉴ID',
    `MENU_NAME` VARCHAR(225) NULL COMMENT '메뉴명',
    `MENU_URL` VARCHAR(225) NULL COMMENT '메뉴URL',
    `DEPTH` INT NULL COMMENT '메뉴단계',
    `P_MENU_ID` VARCHAR(50) NULL COMMENT '부모메뉴ID',
    `SORT_NO` INT NULL COMMENT '순서',
    `REG_DATE` DATE NULL COMMENT '등록일자',
    `UPD_DATE` DATE NULL COMMENT '수정일자',
    `USE_YN` VARCHAR(2) NULL COMMENT '사용여부',
    `AUTH_ID` VARCHAR(2) NULL COMMENT '권한ID',
    PRIMARY KEY (`MENU_ID`)
);

/*권한테이블 생성*/
CREATE TABLE `auth` (
                        `AUTH_ID` varchar(10) NOT NULL COMMENT '권한ID',
                        `AUTH_NAME` varchar(45) DEFAULT NULL COMMENT '권한명',
                        `USE_YN` varchar(2) DEFAULT NULL COMMENT '사용여부',
                        `REG_DATE` date DEFAULT NULL COMMENT '등록일',
                        `UPD_DATE` date DEFAULT NULL COMMENT '수정일',
                        PRIMARY KEY (`AUTH_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci