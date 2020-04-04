package com.example.demo.controllers;

import com.example.demo.services.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerMultiply {

    @Autowired
    private Calculator calculator;

    public ControllerMultiply()
    {
        System.out.println("Creando Controlador Multiply");
    }

    @GetMapping("/multiplicar")
    public String multiplicar() {
        int a = 5;
        int b = 10;

        return "La multiplicación de los numeros: " + a + " y " + b + " es: " + calculator.mltiply(a, b);
    }
}
