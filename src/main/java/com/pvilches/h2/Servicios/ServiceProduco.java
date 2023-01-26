package com.pvilches.h2.Servicios;

import com.pvilches.h2.Entity.Productos;
import com.pvilches.h2.Interface.ProductoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ServiceProduco {
     @Autowired
     private ProductoInterface productoInterface;

    @Transactional(readOnly = true)
    public List<Productos> listarProductos(){
        return (List<Productos>) productoInterface.findAll();
    }
}
