
package com.lpifsp.listadeexercicios4bim;

public class EXERC_05_Diaria_Semanal {

    public int getdia() {
        return dia;
    }

    public void setdia(int dia) {
        this.dia = dia;
    }

    protected int dia;
    
    void time_set_day(){
        switch (dia) {
            case 1:
                System.out.println("Segunda-Feira");
                break;
            case 2:
                System.out.println("Terça-Feira");
                break;
            case 3:
                System.out.println("Quarta-Feira");
                break;
            case 4:
                System.out.println("Quinta-Feira");
                break;
            case 5:
                System.out.println("Sexta-Feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Não existe dia da semana 8!!!");
                        
                break;
        }
        
       
    }
}
