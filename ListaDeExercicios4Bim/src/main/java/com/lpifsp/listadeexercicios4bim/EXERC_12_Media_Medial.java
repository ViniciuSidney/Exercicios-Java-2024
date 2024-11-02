
package com.lpifsp.listadeexercicios4bim;

public class EXERC_12_Media_Medial {

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    protected int nota1;
    protected int nota2;
    protected int nota3;

    void aritmetica_media(){    
        float media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Média das notas: " + media);
    }
}
