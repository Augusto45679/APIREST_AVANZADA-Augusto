package org.example.controllers;

import org.example.entities.Domicilio;
import org.example.services.DomicilioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/domicilios")
public class DomicilioController extends BaseControllerImpl<Domicilio,DomicilioServiceImpl> {
    @Autowired
    private DomicilioServiceImpl domicilioServiceImpl;

}

