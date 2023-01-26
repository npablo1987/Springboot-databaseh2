package com.pvilches.h2.Controller;


import com.pvilches.h2.Entity.Productos;
import com.pvilches.h2.Servicios.ServiceProduco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private ServiceProduco serviceProduco;

    @GetMapping("listar")
    public Iterable<Productos> listProductos(){return serviceProduco.getProductos(); }
}


