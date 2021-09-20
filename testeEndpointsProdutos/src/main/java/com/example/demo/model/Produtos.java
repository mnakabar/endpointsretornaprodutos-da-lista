package com.example.demo.model;

public class Produtos {

    private String nome;
    private double peso;

    public Produtos(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }

    @Override
    public String toString(){
        return nome + " " + peso;
    }

}
