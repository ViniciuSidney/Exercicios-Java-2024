
package com.lpifsp.listadeexercicios4bim;

public class EXERC_13_Trocados {

    public int getValorpago() {
        return valorpago;
    }

    public void setValorpago(int valorpago) {
        this.valorpago = valorpago;
    }


    public int getValortotal() {
        return valortotal;
    }

    public void setValortotal(int Valortotal) {
        this.valortotal = valortotal;
    }

    protected int valortotal;
    protected int valorpago;
    

    void troco(){
        if( valorpago < valortotal ){
         System.out.println("falta : " + (valortotal - valorpago ) );
        }else{
         System.out.println("Troco : " + (valorpago - valortotal  ) ); 
        }
            
        
    }
}
