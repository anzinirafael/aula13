package com.company;

public class Peixe extends Animal implements ControllerPeixe{
    private String corDaEscama;

    public Peixe(float peso, int idade, int membros, String corDaEscama) {
        super(peso, idade, membros);
        this.setCorDaEscama(corDaEscama);
    }

    public String getCorDaEscama() {
        return corDaEscama;
    }

    public void setCorDaEscama(String corDaEscama) {
        this.corDaEscama = corDaEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Algas");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de Animais marinhos");
    }


    @Override
    public void soltarBolha() {
        System.out.println("^^ Bolhas");
    }
}
