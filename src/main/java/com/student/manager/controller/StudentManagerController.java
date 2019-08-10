package com.student.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentManagerController {

	@Value("${student-manager.version}")
	String version;
	
	@Autowired
	@Qualifier("getHostName")
	String nodeName;
    
    @GetMapping("/instance")
    public String getInstance() {
        return nodeName;
    }
    
    @GetMapping("/version")
    public String getServiceVersion() {
        return version;
    }
    
}