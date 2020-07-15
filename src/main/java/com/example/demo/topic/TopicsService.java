package com.example.demo.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicsService {

	private List<Topics> topics=Arrays.asList(
			new Topics("Spring","Spring Framework","spring framework description"),
			new Topics("Java","Java Core","Java core description"),
			new Topics("Javascript","Javascript js","Javascript Description")
			);
	public List<Topics> getAllTopics(){
		return topics;
	}
}
