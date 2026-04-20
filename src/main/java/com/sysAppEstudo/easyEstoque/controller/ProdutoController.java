package com.sysAppEstudo.easyEstoque.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sysAppEstudo.easyEstoque.models.ProdutoModel;
import com.sysAppEstudo.easyEstoque.repository.ProdutoRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/produto")
public class ProdutoController {
    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping
    public ResponseEntity<ProdutoModel> criarProduto(@RequestBody @Valid ProdutoModel bodyProduto){
        ProdutoModel produtoCadastrado=produtoRepository.save(bodyProduto);

        return new ResponseEntity<>(produtoCadastrado,HttpStatus.OK);
    }
}
