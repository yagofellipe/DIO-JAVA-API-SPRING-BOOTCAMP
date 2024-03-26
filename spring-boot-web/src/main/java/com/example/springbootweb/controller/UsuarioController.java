package com.example.springbootweb.controller;

import com.example.springbootweb.model.Usuario;
import com.example.springbootweb.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @GetMapping()
    public List<Usuario> getUsers(){
        return usuarioRepository.listAll();
    }
    @GetMapping("/{id}")
    public Usuario getOne(@PathVariable("id") Integer id) {
        return usuarioRepository.finById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        usuarioRepository.remove(id);
    }
    @PostMapping()
    public void postUser(@RequestBody Usuario usuario) {
        usuarioRepository.save(usuario);
    }
    @PutMapping()
    public void putUser(@RequestBody Usuario usuario){
        usuarioRepository.save(usuario);
    }
}
