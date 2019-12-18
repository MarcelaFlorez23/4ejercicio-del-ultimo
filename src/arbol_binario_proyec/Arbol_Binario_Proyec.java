/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol_binario_proyec;

import javax.swing.JOptionPane;

/**
 *
 * @author Marcela Florez
 */
public class Arbol_Binario_Proyec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 0, elemen,opciones,elementos,el;
     
     ArbolBinario arbolito = new ArbolBinario();
     
     do
     {
       try{
           
           
       opcion = Integer.parseInt(JOptionPane.showInputDialog(null ,
               "1. Agregar un nodo\n"
             + "2. borrrar nodos \n"
             + "3. Buscar nodos e indicar si existen \n" 
             + "4. Indicar la altura del Arbol  \n"  
             + "5. Indicar el nivel del Arbol \n"  
             + "6. Mostrar el arbol \n"  
             + "7. Mostrar los valores mayores a 30 \n" 
             + "8. Mostrar los valores menores a 65 \n"
             + "9. Salir \n"
             + " Elige una Opcion " , " Arboles Binarios ",JOptionPane.QUESTION_MESSAGE));
       
       switch (opcion){
        
           case 1:
                elemen = Integer.parseInt(JOptionPane.showInputDialog(null, 
                      "Ingrese el numero del nodo:", "Agregando nodo", 
                      JOptionPane.QUESTION_MESSAGE));
                
                arbolito.agregarnodos(elemen);
           break;
                 
           case 2:
               opciones = Integer.parseInt(JOptionPane.showInputDialog(null ,
               "1. inOrden\n"
             + "2. preOrden\n"
             + "3. postOrden\n" 
             + " Elige una Opcion " , " Arboles Binarios ",JOptionPane.QUESTION_MESSAGE));
       
              switch (opciones){
                  case 1:
                      elementos = Integer.parseInt(JOptionPane.showInputDialog(null, 
                      "Ingrese el numero del nodo que desea ELIMINAR:", "Eliminando nodo", 
                      JOptionPane.QUESTION_MESSAGE));
                      try{
                      arbolito.eliminar(elementos);
                      }catch(Exception e){
                          
                      }
                      break;
                  case 2:
                     elementos = Integer.parseInt(JOptionPane.showInputDialog(null, 
                      "Ingrese el numero del nodo que desea ELIMINAR:", "Eliminando nodo", 
                      JOptionPane.QUESTION_MESSAGE));
                      try{
                      arbolito.eliminar(elementos);
                      }catch(Exception e){
                          
                      }
                      break;
                  case 3:
                     elementos = Integer.parseInt(JOptionPane.showInputDialog(null, 
                      "Ingrese el numero del nodo que desea ELIMINAR:", "Eliminando nodo", 
                      JOptionPane.QUESTION_MESSAGE));
                      try{
                      arbolito.eliminar(elementos);
                      }catch(Exception e){
                          
                      }
                      break;
              }   
           break;
           
           case 3:
               opciones = Integer.parseInt(JOptionPane.showInputDialog(null ,
               "1. inOrden\n"
             + "2. preOrden\n"
             + "3. postOrden\n" 
             + " Elige una Opcion " , " Arboles Binarios ",JOptionPane.QUESTION_MESSAGE));
       
              switch (opciones){
                  case 1:
                      el = Integer.parseInt(JOptionPane.showInputDialog(null, 
                      "Ingrese el numero del nodo que desea BUSCAR:", "BUSCANDO nodo", 
                      JOptionPane.QUESTION_MESSAGE));
                      
                      arbolito.buscarnodoMay(el);
                      
                      break;
                  case 2:
                      el = Integer.parseInt(JOptionPane.showInputDialog(null, 
                      "Ingrese el numero del nodo que desea BUSCAR:", "BUSCANDO nodo", 
                      JOptionPane.QUESTION_MESSAGE));
                      
                      arbolito.buscarnodoMen(el);
                      
                      break;
                  case 3:
                      el = Integer.parseInt(JOptionPane.showInputDialog(null, 
                      "Ingrese el numero del nodo que desea BUSCAR:", "BUSCANDO nodo", 
                      JOptionPane.QUESTION_MESSAGE));
                      
                      arbolito.buscarnodoMay(el);
                      
                      break;
              }   
              
           break;
           
           case 4:
              opciones = Integer.parseInt(JOptionPane.showInputDialog(null ,
               "1. inOrden\n"
             + "2. preOrden\n"
             + "3. postOrden\n" 
             + " Elige una Opcion " , " Arboles Binarios ",JOptionPane.QUESTION_MESSAGE));
       
              switch (opciones){
                  case 1:
                       arbolito.altura2();
                      
                      break;
                  case 2:
                      arbolito.altura();
                      break;
                  case 3:
                      arbolito.altura2();
                      break;
              }   
           break;
           
           case 5:
             opciones = Integer.parseInt(JOptionPane.showInputDialog(null ,
               "1. inOrden\n"
             + "2. preOrden\n"
             + "3. postOrden\n" 
             + " Elige una Opcion " , " Arboles Binarios ",JOptionPane.QUESTION_MESSAGE));
       
              switch (opciones){
                  case 1:
                       arbolito.nivel();
                      
                      break;
                  case 2:
                      arbolito.nivel2();
                      break;
                  case 3:
                      arbolito.nivel();
                      break;
              }   
           break;
               
           case 6:
               opciones = Integer.parseInt(JOptionPane.showInputDialog(null ,
               "1. inOrden\n"
             + "2. preOrden\n"
             + "3. postOrden\n" 
             + " Elige una Opcion " , " Arboles Binarios ",JOptionPane.QUESTION_MESSAGE));
       
              switch (opciones){
                  case 1:
                      arbolito.inOrden(arbolito.raiz);
                      break;
                  case 2:
                      arbolito.preOrden(arbolito.raiz);
                      break;
                  case 3:
                      arbolito.postOrden(arbolito.raiz);
                      break;
              }   
           break;
           case 7:
                opciones = Integer.parseInt(JOptionPane.showInputDialog(null ,
               "1. inOrden\n"
             + "2. preOrden\n"
             + "3. postOrden\n" 
             + " Elige una Opcion " , " Arboles Binarios ",JOptionPane.QUESTION_MESSAGE));
       
              switch (opciones){
                  case 1:
                      arbolito.inOrdenDato(arbolito.raiz);
                      break;
                  case 2:
                      arbolito.preOrdenDato(arbolito.raiz);
                      break;
                  case 3:
                      arbolito.postOrdenDato(arbolito.raiz);
                      break;
              }   
               break;
           case 8:
                 opciones = Integer.parseInt(JOptionPane.showInputDialog(null ,
               "1. inOrden\n"
             + "2. preOrden\n"
             + "3. postOrden\n" 
             + " Elige una Opcion " , " Arboles Binarios ",JOptionPane.QUESTION_MESSAGE));
       
              switch (opciones){
                  case 1:
                      arbolito.inOrdenDatoMen(arbolito.raiz);
                      break;
                  case 2:
                      arbolito.preOrdenDatoMen (arbolito.raiz);
                      break;
                  case 3:
                      arbolito.postOrdenDatoMen(arbolito.raiz);
                      break;
              }   
               break;
           case 9:
                JOptionPane.showMessageDialog(null, "Aplicacion Finalizada");
           break;
           
           default:
               JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
          
       }
       }catch (NumberFormatException n){
       JOptionPane.showMessageDialog(null, " Error " + n.getMessage());
       }
    } while (opcion != 9);
    
    
    
    }
    

}

