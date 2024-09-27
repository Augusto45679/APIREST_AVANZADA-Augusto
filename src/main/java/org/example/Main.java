package org.example;


import org.example.entities.Localidad;
import org.example.repositories.LocalidadRepository;
import org.example.repositories.PersonaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import org.example.entities.Domicilio;
import org.example.entities.Persona;

import jakarta.transaction.Transactional;

@SpringBootApplication
public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    @Autowired
    private PersonaRepository personaRepository;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

        System.out.println("Andando! ejej");
    }

    @Bean
    @Transactional
    CommandLineRunner init(PersonaRepository personaRepository, LocalidadRepository localidadRepository) {
        return args -> {
            Localidad localidad1 = Localidad.builder().denominacion("San Martin").build();
            Localidad localidad2 = Localidad.builder().denominacion("Rivadavia").build();
            localidadRepository.save(localidad1);
            localidadRepository.save(localidad2);

            Domicilio domi1 = Domicilio.builder().calle("Perito Moreno").numero(222).build();
            Domicilio domi2 = Domicilio.builder().calle("Peru").numero(129).build();

            Persona persona1 = Persona.builder().apellido("Gimenez").nombre("juan").build();
            Persona persona2 = Persona.builder().apellido("Perez").nombre("miguel").build();
            personaRepository.save(persona1);
            personaRepository.save(persona2);

            localidad1.setDomicilio(domi1);
            localidad2.setDomicilio(domi2);


            persona1.setDomicilio(domi1);
            persona2.setDomicilio(domi2);


        };
    }
}