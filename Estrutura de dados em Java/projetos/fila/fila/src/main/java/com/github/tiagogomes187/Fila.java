package com.github.tiagogomes187;

public class Fila {

    private No refEntradaFila;

    public Fila() {
        this.refEntradaFila = null;
    }

    public void enqueue(No novoNo) {
        novoNo.setRefNo(refEntradaFila);
        refEntradaFila = novoNo;
    }

    public No first() {
        if(!isEmpty()) {
            No primeiroNo = refEntradaFila;
            while(true) {
                if(primeiroNo.getRefNo() != null) {
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    break;
                }
            }
            return primeiroNo;
        }
        return null;
    }

    public No dequeue() {
        if(!this.isEmpty()) {
            No primeiroNo = refEntradaFila;
            No noAuxiliar = refEntradaFila;
            while(true) {
                if(primeiroNo.getRefNo() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return primeiroNo;
        }
        return null;
    }

    public boolean isEmpty() {
        return refEntradaFila == null ? true : false;
    }

    @Override
    public String toString() {
     String stringRetorno = "";
     No noAuxiliar = refEntradaFila;

     if(refEntradaFila != null) {
         while(true) {
             stringRetorno += " [No{objeto=" + noAuxiliar.getObject() + "}]--->";

             if(noAuxiliar.getRefNo() != null) {
                 noAuxiliar = noAuxiliar.getRefNo();

             }else{
                 stringRetorno = "null";
                 break;
             }
         }

     }else {
         stringRetorno = "null";
     }
     return stringRetorno;
    }
}
