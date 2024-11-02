
package com.lpifsp.listadeexercicios4bim;

public class EXERC_24_Carro {

    public int getAno_fabricacao() {
        return ano_fabricacao;
    }

    public void setAno_fabricacao(int ano_fabricacao) {
        this.ano_fabricacao = ano_fabricacao;
    }

    public int getAno_atual() {
        return ano_atual;
    }

    public void setAno_atual(int ano_atual) {
        this.ano_atual = ano_atual;
    }

    protected int ano_fabricacao, ano_atual;
    
    String calculo_idade(){    
        return (ano_atual - ano_fabricacao) + "";
    }
 
}
