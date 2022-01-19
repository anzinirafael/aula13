package com.company;

public class Repitil extends Animal{
    private String cordaEscama;

    public Repitil(float peso, int idade, int membros, String cordaEscama) {
        super(peso, idade, membros);
        this.setCordaEscama(cordaEscama);
    }

    public String getCordaEscama() {
        return cordaEscama;
    }

    public void setCordaEscama(String cordaEscama) {
        this.cordaEscama = cordaEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Rasteja");
    }

    @Override
    public void alimentar() {
        System.out.println("Come Vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de Répitil");
    }

}
