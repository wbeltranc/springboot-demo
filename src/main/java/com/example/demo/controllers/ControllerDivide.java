package com.example.demo.controllers;

import com.example.demo.services.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerDivide {

    @Autowired
    private Calculator calculator;

    public ControllerDivide()
    {
        System.out.println("Creando Controlador Divide");
    }

    @GetMapping("/dividir")
    public String dividir() {
        int a = 50;
        int b = 10;

        return "La división de los numeros: " + a + " y " + b + " es: " + calculator.divide(a, b);
    }

}
