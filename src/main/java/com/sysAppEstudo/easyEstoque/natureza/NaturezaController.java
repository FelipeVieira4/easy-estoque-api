package com.sysAppEstudo.easyEstoque.natureza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sysAppEstudo.easyEstoque.natureza.dto.NaturezaAlterarDTO;
import com.sysAppEstudo.easyEstoque.natureza.dto.NaturezaCriarDTO;
import com.sysAppEstudo.easyEstoque.natureza.dto.NaturezaResponseDTO;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/natureza")
public class NaturezaController {
    @Autowired
    private NaturezaService naturezaService;
    
    @PostMapping
    public ResponseEntity<NaturezaResponseDTO> criarNatureza(@RequestBody @Valid NaturezaCriarDTO bodyNatureza){
    	NaturezaResponseDTO naturezaCadastrada=naturezaService.salvar(bodyNatureza);

        return new ResponseEntity<>(naturezaCadastrada,HttpStatus.OK);
    }
    
    @PutMapping
    public ResponseEntity<NaturezaResponseDTO> alterarNatureza(@RequestBody @Valid NaturezaAlterarDTO bodyNatureza){
    	NaturezaResponseDTO naturezaCadastrada=naturezaService.alterar(bodyNatureza);

        return new ResponseEntity<>(naturezaCadastrada,HttpStatus.OK);
    }
}
