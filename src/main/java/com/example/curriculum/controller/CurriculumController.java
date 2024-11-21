package src.main.java.com.example.curriculum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.curriculum.model.Curriculum;
import com.example.curriculum.service.CurriculumService;

@Controller
public class CurriculumController {

    @Autowired
    private CurriculumService service;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("curriculum", new Curriculum());
        return "home";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Curriculum curriculum, Model model) {
        service.save(curriculum);
        model.addAttribute("email", curriculum.getEmail());
        model.addAttribute("numero", curriculum.getNumero());
        return "success";
    }
}
