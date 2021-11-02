package com.petshopp.Projeto.Pet.Shopp.Animal;

import java.util.List;
import java.util.NoSuchElementException;

import javax.transaction.TransactionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petshopp.Projeto.Pet.Shopp.Animal.base.RegistroJaExiste;
import com.petshopp.Projeto.Pet.Shopp.Animal.base.RegistroNaoExiste;

@Service
@TransactionScoped
public class AnimalService {
	
	@Autowired
	public AnimalRepository repo;
	
	public List<Animal>obtertodos(){
		return repo.findAll();
	}
	
	public Animal criar(Animal novo) {
		if(repo.findById(novo.getId()).isPresent()) {
			throw new RegistroJaExiste();
		}
		return repo.save(novo);
	}
	
	public void atualizar(Animal animal) {
		if(repo.findById(animal.getId()).isEmpty()) {
			throw new RegistroNaoExiste();
		}
		repo.save(animal);
	}
	
	public Animal obterPeloId(String id) {
		try {
			return repo.findById(id).get();
		} catch (NoSuchElementException e) {
			throw new RegistroNaoExiste();
		}
	}
	
	public void excluirAnimalPeloId(String id) {
		try {
			Animal recuperado = repo.findById(id).get();
			repo.delete(recuperado);
		} catch (NoSuchElementException e) {
			throw new RegistroNaoExiste();
		}
	}

}
