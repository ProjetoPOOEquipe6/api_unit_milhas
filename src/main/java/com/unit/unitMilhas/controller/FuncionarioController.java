package com.unit.unitMilhas.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/employee") 
public class FuncionarioController {
    @Autowired

    private FuncionarioRepo employeeRepo;

    
    
}
