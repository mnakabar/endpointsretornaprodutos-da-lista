package com.example.demo.controller;

import com.example.demo.model.Produtos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class TesteEndpoint {

    //Criar produtos
    Produtos produto = new Produtos("Abacaxi",1.55);
    Produtos produto1 = new Produtos("Kiwi", 0.55);
    Produtos produto2 = new Produtos("Pera", 1.25);
    Produtos produto3 = new Produtos("Laranja", 2.60);
    Produtos produto4 = new Produtos("Abacate", 3.87);

    @GetMapping("/produtodalista")
    public List<Produtos> retornandolistaDeProdutos(){
        List<Produtos> produtosList = new ArrayList<>();
        produtosList.add(produto);
        produtosList.add(produto1);
        produtosList.add(produto2);
        produtosList.add(produto3);
        produtosList.add(produto4);

        return produtosList.stream()
                .sorted(Comparator.comparing(lista -> lista.getPeso()))
                .collect(Collectors.toList());
    }


}
