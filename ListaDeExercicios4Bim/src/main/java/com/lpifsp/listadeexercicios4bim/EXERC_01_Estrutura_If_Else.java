
package com.lpifsp.listadeexercicios4bim;

public class EXERC_01_Estrutura_If_Else {

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    protected int numero;
    
    void sinal(){
        if ( numero > 0 ){
            System.out.println("Positivo");
        }else if ( numero < 0 ){
            System.out.println("Negativo");
        }else {
            System.out.println("Zero");
        }
    }
}
