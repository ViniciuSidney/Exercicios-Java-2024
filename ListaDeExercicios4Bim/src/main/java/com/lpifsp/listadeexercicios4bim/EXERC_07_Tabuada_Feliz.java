
package com.lpifsp.listadeexercicios4bim;

public class EXERC_07_Tabuada_Feliz {

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    protected int numero;
    
    void tabuada(){
        for(int i=0;i<10;i++){
            System.out.println(numero + " x " + (i + 1) + " = " + numero * (i + 1) );
        }
        
       
    }
}
