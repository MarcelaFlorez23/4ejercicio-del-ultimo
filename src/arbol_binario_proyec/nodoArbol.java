/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol_binario_proyec;

/**
 *
 * @author Marcela Florez
 */
public class nodoArbol {
    
 public int dato;
 
    nodoArbol hijoizquierdo, hijoderecho;
    
   
    public nodoArbol(int d) {
       this.dato = d;
       
       this.hijoderecho = null ;
       this.hijoizquierdo = null ;
    
   }
  
}

