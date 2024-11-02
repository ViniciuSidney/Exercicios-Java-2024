
package com.lpifsp.listadeexercicios4bim;

public class EXERC_09_Contagem_Regressiva {

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    protected int numero = 10;
    
    void loop(){
        while(numero >= 0 ){
             System.out.println(numero);
            numero -= 1;
           
        }
    }
}
