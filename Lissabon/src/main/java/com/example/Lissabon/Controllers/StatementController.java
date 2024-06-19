package com.example.Lissabon.Controllers;


import com.example.Lissabon.Service.StatementService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/main")
public class StatementController {


    private final StatementService statementService;
    @GetMapping
    public String mainPage(Model model){
        model.addAttribute("statements",statementService.findAllStatement());
        return "main";
    }




}
