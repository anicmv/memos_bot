package com.github.anicmv;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author anicmv
 * @date 2024/7/23 14:30
 * @description memos bot application
 */
@SpringBootApplication
@MapperScan("com.github.anicmv.mapper")
public class MemosBotApplication {

    public static void main(String[] args) {
        SpringApplication.run(MemosBotApplication.class, args);
    }

}
