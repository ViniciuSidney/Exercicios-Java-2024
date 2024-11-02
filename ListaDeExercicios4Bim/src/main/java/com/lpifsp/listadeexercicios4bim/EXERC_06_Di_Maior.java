
package com.lpifsp.listadeexercicios4bim;

public class EXERC_06_Di_Maior {

    public int getidade() {
        return idade;
    }

    public void setidade(int idade) {
        this.idade = idade;
    }

    protected int idade;
    
    void maioral_feliz(){
        if(idade > 18) {
            System.out.println("Parabéns você já é de maior !!!");
        }else{
            System.out.println("Você é de menor ");
        }      
    }
}
