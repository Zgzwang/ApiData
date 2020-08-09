package io.javabrains.springbooststarter.topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class TopicControler {
    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();

    }
        @RequestMapping("/topics/{id}")
        public Topic getTopics(@PathVariable String id) {
        return topicService.getTopics(id);
        }
        @RequestMapping(method= RequestMethod.POST, value="/topics")
        public void addTopic(@RequestBody Topic topic){
                  topicService.addTopic(topic);
        }
    @RequestMapping(method= RequestMethod.PUT, value="/topics/{id}")
    public void updateTopic(@RequestBody Topic topic,@PathVariable String id){
        topicService.upDateTopic(id, topic);
    }
    @RequestMapping(method= RequestMethod.DELETE, value="/topics/{id}")
    public void deleteTopic(@RequestBody Topic topic,@PathVariable String id) {
        topicService.deleteDateTopic(id, topic);
    }


}