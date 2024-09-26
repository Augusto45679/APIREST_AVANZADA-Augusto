package org.example.controllers;

import org.example.entities.Persona;
import org.example.services.PersonaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins ="*") //con esto permitimos el ingreso a nuestra API de distintos origens
@RequestMapping(path ="api/v1/personas") // en esta url encontramos los metodos de persona
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl> {
    @Autowired
    private PersonaServiceImpl personaServiceImpl;

    @GetMapping("/search")
    public ResponseEntity<?> search(@RequestParam String filtro) throws Exception{
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.search(filtro));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \""+e.getMessage()+"\"}"));
        }
    }


}
