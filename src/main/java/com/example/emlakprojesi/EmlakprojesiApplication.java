package com.example.emlakprojesi;

import com.example.emlakprojesi.musteri.Musteri;
import com.example.emlakprojesi.musteri.MusteriRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EmlakprojesiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmlakprojesiApplication.class, args);
		System.out.println("Merhaba");
	}



}
