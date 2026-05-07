package com.giovannaabreu.petshop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.giovannaabreu.petshop.entities.Categoria;
import com.giovannaabreu.petshop.services.CategoriaService;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/categorias")
@CrossOrigin(origins = "*") //
public class CategoriaController {
 

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public List<Categoria> listarTodas() {
        return categoriaService.buscarTodas();
    }

    @PostMapping
    public Categoria salvar(@RequestBody Categoria categoria) {
    
        return categoriaService.salvar(categoria);
    }
        
        @DeleteMapping("/{id}")
        public void deletar(@PathVariable Integer id) {
            categoriaService.deletar(id);
        }
            @PutMapping("/{id}")
            public Categoria atualizar(@PathVariable Integer id, @RequestBody Categoria categoria) {
                categoria.setId_categoria(id);
                return categoriaService.salvar(categoria);
            }
        
    }