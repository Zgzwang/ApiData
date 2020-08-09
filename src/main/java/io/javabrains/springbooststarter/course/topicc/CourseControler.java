package io.javabrains.springbooststarter.course.topicc;
import io.javabrains.springbooststarter.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class CourseControler {
    @Autowired
    private CourseService courseService;

    @RequestMapping("/topics/{id}/courses")
    public List<Course> getAllCourses(@PathVariable String id) {
        return courseService.getAllCourses(id);

    }
        @RequestMapping("/topics/{topicId}/courses/{id}")
        public Course getCourse(@PathVariable String id) {
        return courseService.getCourse(id);
        }
        @RequestMapping(method= RequestMethod.POST, value="/topics/{topicID}/courses/{id}")
        public void addCourse(@RequestBody Course course, @PathVariable String topicId){
                course.setTopic(new Topic(topicId,"",""));
                  courseService.addCourse(course);
        }
    @RequestMapping(method= RequestMethod.PUT, value="/topics/{topicId/courses/{id}")
    public void updateCourse(@RequestBody Course course,@PathVariable String topicId, @PathVariable String id){
        course.setTopic(new Topic(topicId,"",""));
        courseService.upDateCourse(course);
    }
    @RequestMapping(method= RequestMethod.DELETE, value="/topics/{topicId/courses/{id}")
    public void deleteTopic(@RequestBody Course course, @PathVariable String id) {
        courseService.deleteDateCourse(id, course);
    }


}