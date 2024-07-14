package com.practicaAPI.APIRESTSpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*
 * EJEMPLO: @Get Mapping + Parametro: @RequestParam ; MULTIPLES PARAMETROS A MI endpoint DE LA API 
 */
@RestController
public class HelloController {
	
	@GetMapping("/hola")
	public String decirHola(@RequestParam String nombre, @RequestParam int edad, @RequestParam String profesion) {
		return "Hola, tu nombre es: " + nombre + " Tu edad es: " + edad + " Tu profesion es: " + profesion;
		
	}

}
