package br.com.eteczl.workshopspring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @GetMapping("/")
    public ModelAndView Home() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");

        Aluno aluno = new Aluno("Alex Silva","alex@algaworks.com");
        modelAndView.addObject("primeiroAluno", aluno);
         return modelAndView;
    }
}
