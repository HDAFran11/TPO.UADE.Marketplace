package com.uade.tpo.marketplace.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("categories") //localhost:8080/categories
public class CategoriesController {
        @GetMapping  //localhost:8080/categories (GET)
        public String getCategories() {
            return new String();
        }

        @GetMapping("/{categoryId}") //localhost:8080/categories/1 (GET)
        public String getMethodName(@PathVariable String categoryId) {
            return new String();
        }

        @PostMapping("path") //localhost:8080/categories (POST)
        public String createCategory(@RequestBody String entity) {
            //TODO: process POST request
            
            return entity;
        }
        
        
}
