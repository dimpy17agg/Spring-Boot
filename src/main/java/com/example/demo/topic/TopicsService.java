package com.example.demo.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TopicsService {

	private List<Topics> topics=new ArrayList<>(Arrays.asList(
			new Topics("Spring","Spring Framework","spring framework description"),
			new Topics("Java","Java Core","Java core description"),
			new Topics("Javascript","Javascript js","Javascript Description")
			));
	public List<Topics> getAllTopics(){
		return topics;
	}
	
	public Topics getTopic(String id){
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topics topic) {
	          topics.add(topic);
	}

	public void updateTopics(Topics topic, String id) {
		
		for(int i=0;i<topics.size();i++){
			Topics t=topics.get(i);
			if(t.getId().equals(id)){
				topics.set(i,topic);
				return;
			}
		}
	}
}
