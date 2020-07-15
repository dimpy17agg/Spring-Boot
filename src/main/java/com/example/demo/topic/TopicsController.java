package com.example.demo.topic;

import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class TopicsController {

	@Autowired
	private TopicsService topicService;
	
	@RequestMapping("/topics")
	public List<Topics> getAllTopics(){
		//System.out.println(new Topics("900","900","9999"));
		return topicService.getAllTopics();
		
	}
	
}
