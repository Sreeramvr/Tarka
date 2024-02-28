package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("student", new Student());
        return "studentform";
    }

    @PostMapping("/submitForm")
    public String submitForm(@ModelAttribute("student") Student student) {
        // Here you can add code to save the student data in a database or perform any other operation
        return "submitted";
    }
}