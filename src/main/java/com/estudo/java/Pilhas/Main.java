package com.estudo.java.Pilhas;

public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        //COLOCAR OS DADOS NA PILHA;
        pilha.push(new No(1));
        pilha.push(new No(2));
        pilha.push(new No(3));
        pilha.push(new No(4));
        pilha.push(new No(5));
        pilha.push(new No(6));
        // SAÍDA DO MEU CÓDIGO
        System.out.println(pilha);
        System.out.println(pilha.pop());
        System.out.println(pilha.top());
        System.out.println(pilha.isEmpty());
    }
}
