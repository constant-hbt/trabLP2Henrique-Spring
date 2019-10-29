package com.henriqueborges.trabalhojavawebhenrique;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.henriqueborges.trabalhojavawebhenrique.domain.Usuario;
import com.henriqueborges.trabalhojavawebhenrique.repositories.UsuarioRepository;

@SpringBootApplication
public class TrabalhoJavaWebHenriqueApplication implements CommandLineRunner{
	@Autowired
	private UsuarioRepository usuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(TrabalhoJavaWebHenriqueApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Usuario user1 = new Usuario(null, "Henrique Borges", "12421451251", "478523614545", "henrique@gmail", "senha", "34232550", new Date(), "Rua das araucarias");
		Usuario user2 = new Usuario(null, "Samanta D Saints", "12421451111", "478523611235", "samanta@gmail", "senha2", "32321230", new Date(), "Rua das piracibas");
		
		usuarioRepository.saveAll(Arrays.asList(user1, user2));
	}

}
