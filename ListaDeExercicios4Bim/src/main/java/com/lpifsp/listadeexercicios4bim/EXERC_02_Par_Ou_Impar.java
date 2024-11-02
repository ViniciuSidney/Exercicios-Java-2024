
package com.lpifsp.listadeexercicios4bim;

public class EXERC_02_Par_Ou_Impar {

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    protected int numero;
    
    void par_ou_impar(){
        if ( numero % 2 == 0 ){
            System.out.println("Par");
        }else if ( numero % 2 != 0  ){
            System.out.println("Impar");
        }else {
            System.out.println("Não sei, não existe, sei lá");
        }
    }
}
