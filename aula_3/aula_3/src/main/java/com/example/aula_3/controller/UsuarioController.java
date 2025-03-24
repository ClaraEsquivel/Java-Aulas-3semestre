package com.example.aula_3.controller;

import com.example.aula_3.model.Usuario;
import com.example.aula_3.repository.UsuarioRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/usuario")
public class UsuarioController {

    private UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @GetMapping
    //listar
    public List<Usuario> listarTodos(){
        return usuarioRepository.findAll();
    }

    @PostMapping
    //gravar
    public ResponseEntity<Usuario> salvar(@RequestBody Usuario usuario){
        usuarioRepository.save(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuario);
    }

    @PutMapping
    //atualizar
    public ResponseEntity<Usuario> atualizar(@RequestBody Usuario usuario){
        if (usuarioRepository.existsById(usuario.getId())) {
            usuarioRepository.save(usuario);
        }

        return ResponseEntity.ok().body(usuario);
    }

    @DeleteMapping("/{id}")
    //deletar
    public ResponseEntity<Void> excluir(@PathVariable Long id){
        usuarioRepository.deleteById(id);
        return  ResponseEntity.noContent().build();
    }

}
