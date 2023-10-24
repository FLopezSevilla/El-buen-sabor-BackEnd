package com.example.demo.controllers;

import com.example.demo.entities.OrdenCompra;
import com.example.demo.services.BaseServiceImpl;
import com.example.demo.services.OrdenCompraServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/Localidad")
public class OrdenCompraController extends BaseControllerImpl<OrdenCompra, OrdenCompraServiceImpl> {
}
