package first.app.studentsystem.controller;


import first.app.studentsystem.model.Student;
import first.app.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New Student Added";
    }

    @GetMapping("/getAll")
    public List<Student> getallstudent() {
        return studentService.getallstudent();
    }


}
