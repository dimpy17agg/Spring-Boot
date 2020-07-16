package com.example.demo.topic;

import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class TopicsController {

	@Autowired
	private TopicsService topicService;
	
	@RequestMapping("/topics")
    	public List<Topics> getAllTopics(){
		//System.out.println(new Topics("900","900","9999"));
		return topicService.getAllTopics();	
	}
	@RequestMapping("/topics/{id}")
	 public Topics getTopic(@PathVariable String id){
		return topicService.getTopic(id);
	}
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	 public void addTopic(@RequestBody Topics topic){
		topicService.addTopic(topic);
	}

	@RequestMapping(method=RequestMethod.PUT,value="/topics/{id}")
	 public void updateTopics(@RequestBody Topics topic,@PathVariable String id){
		topicService.updateTopics(topic,id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public void deleteTopics(@PathVariable String id){
		topicService.deleteTopic(id);
	}
}
