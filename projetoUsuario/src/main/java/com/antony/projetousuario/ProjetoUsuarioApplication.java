package com.antony.projetousuario;

import com.antony.projetousuario.model.Usuario;
import com.antony.projetousuario.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

@SpringBootApplication
@AllArgsConstructor
public class ProjetoUsuarioApplication implements CommandLineRunner {

    private UsuarioRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(ProjetoUsuarioApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println(LocalDateTime.parse("25/03/2022 10:40:50",formater));

        Usuario usuario = new Usuario(null, "Antony", "Antony1234","Arkham90@");
        Usuario usuarioDois = new Usuario(null, "DEVELOPER", "DEVELOPER12","DEVbooT77");

        repository.saveAll(Arrays.asList(usuario, usuarioDois));
    }
}
