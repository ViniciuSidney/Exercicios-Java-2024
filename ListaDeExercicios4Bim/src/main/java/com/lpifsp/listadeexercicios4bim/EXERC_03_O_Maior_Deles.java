
package com.lpifsp.listadeexercicios4bim;

public class EXERC_03_O_Maior_Deles {

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getNumero3() {
        return numero3;
    }

    public void setNumero3(int numero3) {
        this.numero3 = numero3;
    }

    protected int numero1;
    protected int numero2;
    protected int numero3;
    
    void maior_deles(){
        if ( numero1 > numero2 && numero1 > numero3 ){
            System.out.println("1 é O Maior");
        }else if ( numero2 > numero1 && numero2 > numero3 ){
            System.out.println("2 é O Maior");
        }else if ( numero3 > numero1 && numero3 > numero2 ){
            System.out.println("3 é O Maior");
        }else {
            System.out.println("Não sei");
        }
    }
}
