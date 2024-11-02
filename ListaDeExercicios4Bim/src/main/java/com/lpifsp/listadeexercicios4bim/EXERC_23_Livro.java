
package com.lpifsp.listadeexercicios4bim;

public class EXERC_23_Livro {

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    protected String titulo;
    protected String autor;
    
    public EXERC_23_Livro(){    
        titulo = "Como programar em Java";
        autor = "Ederson";
    }
 
}
