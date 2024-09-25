package org.example.controllers;

import org.example.entities.Persona;
import org.example.services.PersonaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins ="*") //con esto permitimos el ingreso a nuestra API de distintos origens
@RequestMapping(path ="api/v1/personas") // en esta url encontramos los metodos de persona
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl> {
    @Autowired
    private PersonaServiceImpl personaServiceImpl;

}
