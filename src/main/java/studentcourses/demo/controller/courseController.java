package studentcourses.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import studentcourses.demo.model.Course;
import studentcourses.demo.model.CourseRepository;

import java.util.ArrayList;

@Controller
public class courseController {

    @Autowired
    private CourseRepository courseRepo;


    @GetMapping("/courseInfo")
    public String courseInfo (Model model){
        ArrayList<Course> all = (ArrayList<Course>) courseRepo.findAll();
        model.addAttribute("courses", all);
        return "courseInfo";
    }
}
