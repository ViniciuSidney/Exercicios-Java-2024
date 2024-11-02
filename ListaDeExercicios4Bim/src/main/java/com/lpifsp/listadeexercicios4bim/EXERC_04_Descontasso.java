
package com.lpifsp.listadeexercicios4bim;

public class EXERC_04_Descontasso {

    public float getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    protected float preco;

    void descontasso(){
        if ( preco > 100 ){
            double desconto = preco - (preco * 0.1);
            System.out.println("O valor final do produto com um desconto de 10% é "+desconto + " reais");
        }else {
            System.out.println("O valor do produto é menor que R$100, sem desconto para você!");
        }
    }
}
