package com.pvilches.h2.Interface;

import com.pvilches.h2.Entity.Productos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductoInterface extends CrudRepository<Productos, Long> {

}
