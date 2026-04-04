package com.sysAppEstudo.easyEstoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sysAppEstudo.easyEstoque.models.ArmazemModel;

@Repository
public interface  ArmazemRepository extends JpaRepository<ArmazemModel,Long>{}
