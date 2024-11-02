
package com.lpifsp.listadeexercicios4bim;

public class EXERC_10_Somatoria {

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

    public int getNumero4() {
        return numero4;
    }

    public void setNumero4(int numero4) {
        this.numero4 = numero4;
    }

    public int getNumero5() {
        return numero5;
    }

    public void setNumero5(int numero5) {
        this.numero5 = numero5;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    protected int numero1;
    protected int numero2;
    protected int numero3;
    protected int numero4;
    protected int numero5;

    void sominha(){
        System.out.println("Soma Total: " + (numero1 + numero2 + numero3 + numero4 + numero5));
    }
}
