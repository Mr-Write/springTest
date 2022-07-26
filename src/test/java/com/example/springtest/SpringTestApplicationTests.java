package com.example.springtest;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@SpringBootTest
@Slf4j
class SpringTestApplicationTests extends Assertions {

    @Autowired
    private DataSource dataSource;
    @Test
    void contextLoads() {
//        Long aLong = jdbcTemplate.queryForObject("select count(*) from monster", Long.class);
//        log.info("查询到的数量为：{}",aLong);
        log.info("当前容器中的数据源类型：{}",dataSource.getClass());
        assertEquals(1,2,"预期不符合");

    }

}
