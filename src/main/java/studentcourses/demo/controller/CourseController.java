package studentcourses.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import studentcourses.demo.model.*;

import java.util.ArrayList;

@Controller
public class CourseController {

    @Autowired
    private CourseRepository courseRepo;

    @Autowired
    private TeacherRepository teacherRepo;

    @Autowired
    private StudentRepository studentRepo;

    @GetMapping("/courseInfo")
    public String courseInfo (Model model){
        ArrayList<Course> all = (ArrayList<Course>) courseRepo.findAll();
        model.addAttribute("courses", all);
        return "courseInfo";
    }

    @GetMapping("/courseAdmin")
    public String courseAdmin (Model model){
        ArrayList<Student> all = (ArrayList<Student>) studentRepo.findAll();
        model.addAttribute("students", all);
        return "courseAdmin";
    }

    @GetMapping("/courseInfo/courseDetails/{id}")
    public String courseDetails(@PathVariable long id, Model model){
        Course c = courseRepo.findById(id);
        model.addAttribute("course", c);
        return "courseDetails";

    }

    @GetMapping("/courseInfo/courseDelete/{id}")
    public String courseDelete(@PathVariable("id") long id) {
        courseRepo.deleteById(id);
        return "redirect:/courseInfo";
    }

    @GetMapping("/courseAdmin/courseRemove/{id}")
    public String courseRemove(@PathVariable("id") long id) {
        studentRepo.deleteById(id);
        return "redirect:/courseAdmin";
    }

    @GetMapping("/courseInfo/courseCreate")
    public String courseCreate(Model model) {
        model.addAttribute("course", new Course());
        model.addAttribute("teachers", teacherRepo.findAll());
        return "courseCreate";
    }

    @PostMapping("/courseInfo/courseCreate")
    public String courseCreate(@ModelAttribute Course course) {
        courseRepo.save(course);
        return "redirect:/courseInfo";
    }

    @GetMapping("/courseInfo/courseJoin")
    public String courseJoin(Model model) {
        model.addAttribute("student", new Student());
        model.addAttribute("courses", courseRepo.findAll());
        return "courseJoin";
    }

    @PostMapping("/courseInfo/courseJoin")
    public String courseJoin(@ModelAttribute Student student) {
        studentRepo.save(student);
        return "redirect:/courseInfo";
    }

    @GetMapping("/courseAdmin/courseJoinEdit/{id}")
    public String courseJoinEdit(@PathVariable long id, Model model){
        Student student = studentRepo.findById(id);
        model.addAttribute("student", student);
        model.addAttribute("courses", courseRepo.findAll());
        return "courseJoinEdit";

    }

    @PostMapping("/courseAdmin/courseJoinEdit")
    public String courseJoinEdit(@ModelAttribute Student student ){
        studentRepo.save(student);
        return "redirect:/courseAdmin";

    }

    @GetMapping("/courseInfo/courseEdit/{id}")
    public String courseEdit(@PathVariable long id, Model model){
        Course course = courseRepo.findById(id);
        model.addAttribute("course", course);
        model.addAttribute("teachers", teacherRepo.findAll());
        return "courseEdit";

    }

    @PostMapping("/courseInfo/courseEdit")
    public String courseEdit(@ModelAttribute Course course ){
        courseRepo.save(course);
        return "redirect:/courseInfo";

    }


}
