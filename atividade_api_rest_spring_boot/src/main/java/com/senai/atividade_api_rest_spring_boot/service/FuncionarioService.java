package com.senai.atividade_api_rest_spring_boot.service;

import com.senai.atividade_api_rest_spring_boot.exception.EmailJaCadastradoException;
import com.senai.atividade_api_rest_spring_boot.model.Funcionario;
import com.senai.atividade_api_rest_spring_boot.repository.FuncionarioRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
public class FuncionarioService {
    private FuncionarioRepository funcionarioRepository;

    public FuncionarioService(FuncionarioRepository funcionarioRepository){
        this.funcionarioRepository = funcionarioRepository;
    }

    public List<Funcionario> listarTodos(){
        return funcionarioRepository.findAll();
    }

    public Funcionario salvar(@Valid Funcionario funcionario){
        if (funcionarioRepository.findByEmail(funcionario.getEmail()).isPresent()){
            throw new EmailJaCadastradoException ("Funcionário já cadastrado.");
        }
        return funcionarioRepository.save(funcionario);
    }

    public Funcionario atualizar(@Valid Funcionario funcionario){
        Funcionario funcionarioAtualizar = funcionarioRepository.findByEmail(funcionario.getEmail())
                .orElseThrow(() -> new IllegalArgumentException(("Funcionário não encontrado.")));

        funcionarioAtualizar.setNome((funcionario.getNome()));
        funcionarioAtualizar.setEmail((funcionario.getEmail()));
        funcionarioAtualizar.setSexo((funcionario.getSexo()));
        funcionarioAtualizar.setEndereco((funcionario.getEndereco()));

        return funcionarioRepository.save(funcionarioAtualizar);
    }

    public void excluir(Long id){
        Funcionario funcionarioExcluir = funcionarioRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException ("Funcionário não encontrado."));
        funcionarioRepository.delete(funcionarioExcluir);
    }
}

