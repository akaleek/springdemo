/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.aabu.springdemo.repositories;

import edu.aabu.springdemo.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author akaleek
 */
public interface AuthorRepository extends CrudRepository<Author, Long>{
    
}
