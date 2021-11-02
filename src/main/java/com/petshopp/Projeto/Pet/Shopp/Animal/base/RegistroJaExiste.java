package com.petshopp.Projeto.Pet.Shopp.Animal.base;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class RegistroJaExiste extends RuntimeException {

}
