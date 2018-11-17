package com.boot.bootpract.control.topic;



import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.bootpract.model.topic.Topic;

@RestController
public class TopicController {
	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		
				return Arrays.asList(
						new Topic("Spring", "Spring Framework", "Spring Framework Description"),
						new Topic("java", "Core Java", "Core Java Description"),
						new Topic("javascript", "JavaScript", "JavaScript Description"));
	}

}
