package com.estudo.java.Pilhas;

public class Pilha {
    private No refnoEntradaPilha;

    public Pilha() {
        this.refnoEntradaPilha = null;
    }

    public void push(No novoNo){// METODO PARA COLOCAR UM NOVO LIVRO NA PILHA
        No refAuxiliar = refnoEntradaPilha;// na hora que da um push
        refnoEntradaPilha = novoNo;// pegamos a nossa nova referencia do no que acabamos de empilhar
        novoNo.setRefno(refAuxiliar);
    }

    public No pop(){// METODO POP, PARA PODER RETIRAR DA FILA O "LIVRO"
        if (!this.isEmpty()){// tratamento para ver se pilha nao estiver vazia!
            //a "!! antes do meu this.isEmpty"referindo ao metodo do meu isEmpty", a "!" significa se o metodo nao estiver vazio
            No noPopped = refnoEntradaPilha;
            noPopped = refnoEntradaPilha.getRefno();
        }
        return null;
    }

    public No top(){
        return refnoEntradaPilha;
    }
    public boolean isEmpty(){
        if (refnoEntradaPilha==null){
            return true;
        }
        return false;


    }

    // METODO TO STRING PARA NOSSO OUTPUT
    @Override
    public String toString(){
        String stringRetorno = "---------\n";
        stringRetorno += "     Pilha\n";// concatenação " string += string "
        stringRetorno += "---------\n";

        No noAuxiliar = refnoEntradaPilha;

        while (true){
            if (noAuxiliar !=null){ //Se a nossa referencia auxiliar e diferente de nula
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefno();// VAI SER A PRORPIA REFERENCIA DO MEU NO, ENTAO NOS VAMOS PASSAR ELE COMO O MEU PROXIMO NO
            } else {
                break;
            }
        }
        stringRetorno += "=========\n";
        return stringRetorno;
    }



}
