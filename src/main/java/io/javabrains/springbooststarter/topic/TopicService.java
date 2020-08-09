package io.javabrains.springbooststarter.topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;
    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("spring", "Spring Framework ","Spring Framework Description"),
            new Topic("java", "Core Java ","Core Java description"),
            new Topic("javascript", "Core Javascript ","Core Javascript Description")
    ));

    public List<Topic> getAllTopics() {
        //return topics;
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;

    }
    public Topic getTopics(String id) {
       // return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
       return topicRepository.findById(id).orElse(null);
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void upDateTopic(String id, Topic topic) {
       // for (int i = 0; i < topics.size(); i++  ){
        //    Topic t = topics.get(i);
         //   if(t.getId().equals(id)){
         //       topics.set(i,topic);
          //      return;
          //  }
       // }
        topicRepository.save(topic);
    }

    public void deleteDateTopic(String id, Topic topic) {
       // topics.removeIf(t -> t.getId().equals(id) );
        topicRepository.deleteById(id);
    }
}
