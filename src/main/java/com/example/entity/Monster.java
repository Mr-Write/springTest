package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "monster01")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Monster {
    private Integer id;
    private String name;
    private String skill;
}
