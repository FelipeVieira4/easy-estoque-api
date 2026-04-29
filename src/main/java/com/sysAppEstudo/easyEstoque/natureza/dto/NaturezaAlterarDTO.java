package com.sysAppEstudo.easyEstoque.natureza.dto;

import jakarta.validation.constraints.NotBlank;

public record NaturezaAlterarDTO(
		Long idNatureza,
	    @NotBlank(message = "Descrição da Natureza não pode ser em branco")
	    String descricao,
	    boolean ativo
) {}