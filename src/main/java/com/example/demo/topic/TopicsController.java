package com.example.demo.topic;

import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TopicsController {

	@RequestMapping("/topics")
	public List<Topics> topics(){
		//System.out.println(new Topics("900","900","9999"));
		return Arrays.asList(
				new Topics("Spring","Spring Framework","spring framework description"),
				new Topics("Java","Java Core","Java core description"),
				new Topics("Javascript","Javascript js","Javascript Description")
				);
		
	}
	
}
