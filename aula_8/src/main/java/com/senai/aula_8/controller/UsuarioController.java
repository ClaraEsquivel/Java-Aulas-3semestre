package com.senai.aula_8.controller;

import com.senai.aula_8.model.Usuario;
import com.senai.aula_8.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public List<Usuario> listarTodos(){
        return usuarioService.listarTodos();
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(@Valid @RequestBody Usuario usuario){
        usuarioService.salvar(usuario);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("mensagem","Usuário cadastrado com sucesso."));
    }

    @PutMapping
    public ResponseEntity<Map<String, Object>> atualizar(@Valid @RequestBody Usuario usuario){
        usuarioService.atualizar(usuario);
        return ResponseEntity
                .ok()
                .body(Map.of("mensagem","Usuário atualizado com sucesso."));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> excluir(@PathVariable Long id){
        usuarioService.excluir(id);
        //ResponseEntity.noContent().build();
        return ResponseEntity
                .ok()
                .body(Map.of("mensagem", "Usuário excluido com sucesso."));
    }
}