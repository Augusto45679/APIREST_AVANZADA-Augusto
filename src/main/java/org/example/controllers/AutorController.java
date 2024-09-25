package org.example.controllers;

import org.example.entities.Autor;
import org.example.services.AutorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/autores")
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl> {

    @Autowired
    private AutorServiceImpl autorServiceImpl;

}
