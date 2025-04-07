package com.senai.atividade_api_rest_spring_boot.repository;

import com.senai.atividade_api_rest_spring_boot.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
