package com.sysAppEstudo.easyEstoque.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sysAppEstudo.easyEstoque.models.ArmazemModel;
import com.sysAppEstudo.easyEstoque.repository.ArmazemRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/armazem")
public class ArmazemController {
    
    @Autowired
    private ArmazemRepository armazemRepository;

    @PostMapping
    public ResponseEntity<ArmazemModel> criarNatureza(@RequestBody @Valid ArmazemModel bodyArmazem){
        ArmazemModel armazemCadastrado=armazemRepository.save(bodyArmazem);

        return new ResponseEntity<>(armazemCadastrado,HttpStatus.OK);
    }
}
