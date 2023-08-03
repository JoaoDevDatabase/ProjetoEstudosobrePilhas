package com.estudo.java.Pilhas;

public class No {
    private int dado;
    private No refno = null;

    public No(int dado) {
        this.dado = dado;
    }

    public No() {

    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getRefno() {
        return refno;
    }

    public void setRefno(No refno) {
        this.refno = refno;
    }

    @Override
    public String toString() {
        return "No{" +
                "dado=" + dado +
                '}';
    }
}
