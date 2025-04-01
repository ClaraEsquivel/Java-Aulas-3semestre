package com.senai.aula_8.service;

import com.senai.aula_8.exception.EmailJaCadastradoException;
import com.senai.aula_8.model.Usuario;
import com.senai.aula_8.repository.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
public class UsuarioService {
    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> listarTodos(){
        return usuarioRepository.findAll();
    }

    public  Usuario salvar(@Valid Usuario usuario){
        if (usuarioRepository.findByEmail(usuario.getEmail()).isPresent()){
            throw new EmailJaCadastradoException("Usuário já cadastrado.");
        }
        return usuarioRepository.save(usuario);
    }

    public Usuario atualizar(@Valid Usuario usuario){
        Usuario usuarioAtualizar = usuarioRepository.findByEmail(usuario.getEmail())
                .orElseThrow(() -> new IllegalArgumentException(("Usuario não encontrado.")));

        usuarioAtualizar.setNome(usuario.getNome());
        usuarioAtualizar.setEmail(usuario.getEmail());
        usuarioAtualizar.setSenha(usuario.getSenha());

        return usuarioRepository.save(usuarioAtualizar);
    }

    public void excluir(Long id){
        Usuario usuarioExcluir = usuarioRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException ("Usuário não encontrado."));
        usuarioRepository.delete(usuarioExcluir);
    }
}