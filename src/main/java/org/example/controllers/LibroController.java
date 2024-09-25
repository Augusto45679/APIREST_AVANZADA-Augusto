package org.example.controllers;

import org.example.entities.Libro;
import org.example.services.LibroServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/libros")
public class LibroController extends BaseControllerImpl<Libro, LibroServiceImpl> {

    @Autowired
    private LibroServiceImpl libroServiceImpl;

}
