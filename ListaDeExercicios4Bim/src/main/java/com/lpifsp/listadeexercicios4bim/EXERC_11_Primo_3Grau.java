
package com.lpifsp.listadeexercicios4bim;

public class EXERC_11_Primo_3Grau {

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    protected int numero;

    void primomacia(){    
        int divisores = 0, valor = 1;
        if ( numero > 0 ){
            while (valor <= numero) {
                if ( numero % valor == 0 ){
                    divisores ++;
                }
                valor++;   
            }

            if ( divisores == 2 ){
                System.out.println("O número "+ numero +" é primo");
            }else{
                System.out.println("O número "+ numero +" não é primo"); 
            }

        }else{
            System.out.println("Este número é negativo ou igual a zero");
        }
    }
}
