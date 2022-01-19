package com.company;

public class Aves extends Animal implements ControllerAves{
    private String corDaPena;

    public Aves(float peso, int idade, int membros, String corDaPena) {
        super(peso, idade, membros);
        this.setCorDaPena(corDaPena);
    }

    public String getCorDaPena() {
        return corDaPena;
    }

    public void setCorDaPena(String corDaPena) {
        this.corDaPena = corDaPena;
    }


    @Override
    public void fazerNinho() {
        System.out.println("Ninho feito");
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Minhoca");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de Canto");
    }

}
