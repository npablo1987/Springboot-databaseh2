package com.pvilches.h2.Servicios.imple;

import com.pvilches.h2.Entity.Productos;
import com.pvilches.h2.Interface.ProductoInterface;
import com.pvilches.h2.Servicios.ServiceProduco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServicioImpl extends ServiceProduco {

    @Autowired
     private ProductoInterface productoInterface;

    @Override
    public List<Productos> getProductos(){
        return (List<Productos>) productoInterface.findAll();
    }

}
