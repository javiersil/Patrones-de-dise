/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoradortexto;

/**
 *
 * @author cosma_000
 */
public abstract class ComponenteTexto {
   protected String texto;
    public abstract String imprimir();
   public void leerTexto(String t){
   texto=t;
   }
   
}
