
package com.lpifsp.listadeexercicios4bim;

public class EXERC_14_Temperado {

    public float getCelsius() {
        return celsius;
    }

    public void setCelsius(int celsius) {
        this.celsius = celsius;
    }

    protected float celsius;
   

    void transformacao(){
        System.out.println("A conversão de "+ celsius +"° Celsius para Fahrenheit é: " + ((celsius * 9/5) + 32) );   
    }
}
