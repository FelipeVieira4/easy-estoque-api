package com.sysAppEstudo.easyEstoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sysAppEstudo.easyEstoque.models.ProdutoModel;

@Repository
public interface ProdutoRepository  extends JpaRepository<ProdutoModel,Long>{}