package com.petshopp.Projeto.Pet.Shopp.Animal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/animais")
public class AnimalController {
	/*utilizado para se criar o reposiutorio, o auto cria tudo sozinho*/
	@Autowired
	private AnimalController service;
	
	@GetMapping("/{id}")
	public Animal obterTodos(@PathVariable("id") String id) {
		return service.obter
	}
	
	@GetMapping
	public List<Animal>obter
	
	
	

}
