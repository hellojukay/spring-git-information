package com.example.springgitinformation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ConfigurationProperties(prefix = "com.zyd")
@RestController
@PropertySource(value={"classpath:git.properties"})
public class Help {


    @Value("${git.branch}")
    public String branch;

    @Value("${git.commit.id.abbrev}")
    public String version;


    @RequestMapping(value="/branch")
    public String branch() {
        return branch;
    }

    @RequestMapping(value="/version")
    public String version() {
        return version;
    }
}