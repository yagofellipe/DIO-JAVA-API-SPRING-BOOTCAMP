package com.example.diojpa;

import com.example.diojpa.model.User;
import com.example.diojpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartAPP implements CommandLineRunner {
    @Autowired
    private UserRepository respository;
    @Override
    public void run(String... args) throws Exception {
        User usuario = new User();
        usuario.setName("John Doe");
        usuario.setUsername("john");
        usuario.setPassword("123");

        respository.save(usuario);

        for(User u : respository.findAll()){
            System.out.println(u);
        }
    }
}
