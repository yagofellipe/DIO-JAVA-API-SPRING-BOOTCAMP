package com.example.dio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class SistemasMensagem implements CommandLineRunner {
    @Autowired
    private Remetente remetente;
    @Override
    public void run(String... args) throws Exception {
        System.out.printf("Mensagem enviada por? " + remetente.getNome()
                + "\nEmail: " + remetente.getEmail()
                + "\nTelefones: " + remetente.getTelefones());
        System.out.println("Seu cadastro foi aprovado!");
    }
}
