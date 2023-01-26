package com.pvilches.h2.Interface;

import com.pvilches.h2.Entity.Productos;
import org.springframework.data.repository.CrudRepository;



public interface ProductoInterface extends CrudRepository<Productos, Long> {

}
