package com.example.result;
import org.springframework.stereotype.Controller; import org.springframework.ui.Model; import org.springframework.web.bind.annotation.*;
@Controller public class ResultController {
private final StudentResultRepository repo; public ResultController(StudentResultRepository r){repo=r;}
@GetMapping("/") public String home(Model m){m.addAttribute("studentResult",new StudentResult());return "index";}
@PostMapping("/save") public String save(@ModelAttribute StudentResult r,Model m){r.calculate();repo.save(r);m.addAttribute("studentResult",r);m.addAttribute("saved",true);return "result";}
@GetMapping("/results") public String results(Model m){m.addAttribute("results",repo.findAll());return "results";}
@PostMapping("/delete/{id}") public String delete(@PathVariable Long id){repo.deleteById(id);return "redirect:/results";}
}