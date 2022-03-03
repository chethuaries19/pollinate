package com.example.pollinate.persistence;

import com.example.pollinate.model.Product;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<Product, Integer> {

}
