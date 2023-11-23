package com.jupiter.jupiterback.controller;

import com.jupiter.jupiterback.pessoa.DataPerson;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/person")
public class PersonController {
    @PutMapping
    public void PersonController (@RequestBody DataPerson person) {
        System.out.println(person);
    }
}
