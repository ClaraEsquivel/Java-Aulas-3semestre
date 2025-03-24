package com.example.aula_3.controller;

import com.example.aula_3.model.Funcionario;
import com.example.aula_3.model.Usuario;
import com.example.aula_3.repository.FuncionarioRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {
    
    private FuncionarioRepository funcionarioRepository;
    
    public FuncionarioController(FuncionarioRepository funcionarioRepository){
        this.funcionarioRepository = funcionarioRepository;
    }

    @GetMapping
    //listar
    public List<Funcionario> listarTodos(){
        return funcionarioRepository.findAll();
    }

    @PostMapping
    //gravar
    public ResponseEntity<Funcionario> salvar(@RequestBody Funcionario funcionario){
        funcionarioRepository.save(funcionario);
        return ResponseEntity.status(HttpStatus.CREATED).body(funcionario);
    }

    @PutMapping
    //atualizar
    public ResponseEntity<Funcionario> atualizar(@RequestBody Funcionario funcionario){
        if (funcionarioRepository.existsById(funcionario.getId())) {
            funcionarioRepository.save(funcionario);
        }

        return ResponseEntity.ok().body(funcionario);
    }

    @DeleteMapping("/{id}")
    //deletar
    public ResponseEntity<Void> excluir(@PathVariable Long id){
        funcionarioRepository.deleteById(id);
        return  ResponseEntity.noContent().build();
    }
}
