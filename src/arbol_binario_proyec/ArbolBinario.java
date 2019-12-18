/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol_binario_proyec;

import java.util.Optional;

/**
 *
 * @author Marcela Florez
 */
public class ArbolBinario {

   
     nodoArbol raiz ; 
     int  numNod=0;
   
   
public ArbolBinario (){

    raiz = null;
}

    public void agregarnodos (int d){

    nodoArbol nuevo = new nodoArbol (d);
    
    if (raiz == null){
        raiz = nuevo;
    }else
    {
        nodoArbol auxiliar =  raiz;
        nodoArbol padre;
        while (true)
        {
            padre = auxiliar;
            if (d < auxiliar.dato)
            {
                auxiliar = auxiliar.hijoizquierdo;
                if (auxiliar == null)
                {
                 padre.hijoizquierdo = nuevo;
                 return;
                }
            }else
              {
                 auxiliar = auxiliar.hijoderecho;
                 if (auxiliar == null)
                  {
                     padre.hijoderecho = nuevo;
                     return;
                  }
              } 
        }
    }
}
public boolean estaVacio(){
       return raiz == null;
}
public void inOrden (nodoArbol r){

    if (r != null){
        inOrden (r.hijoizquierdo);
        System.out.println(r.dato);
        inOrden(r.hijoderecho);
    }
}
public void inOrdenDato (nodoArbol r){

    if (r != null){
        
        if(r.hijoizquierdo.dato>30){
            
            System.out.println("Dato mayor a 30: " + r.hijoizquierdo.dato);
        
            
        } 
        if (r.dato>=30){
            System.out.println("Dato mayor a 30: " +raiz.dato);
            
        } 
        if(r.hijoderecho.dato>30){
                System.out.println("Dato mayor a 30: " + r.hijoderecho.dato);
                
            }else System.out.println("No hay datos mayores a 30");
                    
    }
     
}
public void inOrdenDatoMen (nodoArbol r){

    if (r != null){
        
        if(r.hijoizquierdo.dato<65){
            
            System.out.println("Dato menor a 65: " + r.hijoizquierdo.dato);
        
            
        } 
        if (r.dato<65){
            System.out.println("Dato menor a 65: " +raiz.dato);
            
        } 
        if(r.hijoderecho.dato<65){
                System.out.println("Dato menor a 65: " + r.hijoderecho.dato);
            }
                    
    }else System.out.println("No hay datos menores a 65");
     
}

public void preOrden (nodoArbol r){

    if (r != null){
        System.out.println(r.dato);
        preOrden (r.hijoizquierdo);
        preOrden(r.hijoderecho);
    }

}
public void preOrdenDato (nodoArbol r){

    if (r != null){
       
          if (r.dato>=30){
            System.out.println("Dato mayor a 30:" +raiz.dato);
        
    }
          if(r.hijoizquierdo.dato>30){
            
            System.out.println("Dato mayor a 30: " + r.hijoizquierdo.dato);
          }
          if(r.hijoderecho.dato>30){
                System.out.println("Dato mayor a 30: " + r.hijoderecho.dato);
            }else System.out.println("No hay datos mayores a 30");
                    
    }

}
public void preOrdenDatoMen (nodoArbol r){

    if (r != null){
       
          if (r.dato<65){
            System.out.println("Dato menor a 65: " +raiz.dato);
        
    }
          if(r.hijoizquierdo.dato<65){
            
            System.out.println("Dato menor a 65: " + r.hijoizquierdo.dato);
          }
          if(r.hijoderecho.dato<65){
                System.out.println("Dato menor a 65: " + r.hijoderecho.dato);
            }
                    
    }else System.out.println("No hay datos menores a 65");

}


public void postOrden (nodoArbol r){

    if (r != null){
        postOrden (r.hijoizquierdo);
        postOrden(r.hijoderecho);
        System.out.println(r.dato);
    }


}
public void postOrdenDato (nodoArbol r){

    if (r != null){
         if(r.hijoizquierdo.dato>30){
            
            System.out.println("Dato mayor a 30: " + r.hijoizquierdo.dato);
          }
          if(r.hijoderecho.dato>30){
                System.out.println("Dato mayor a 30: " + r.hijoderecho.dato);
          }
          
          if (r.dato>=30){
            System.out.println("Dato mayor a 30: " +raiz.dato);
        
    
          }else System.out.println("No hay datos mayores a 30");

    }
    
}
public void postOrdenDatoMen (nodoArbol r){

    if (r != null){
         if(r.hijoizquierdo.dato<65){
            
            System.out.println("Dato menor a 65: " + r.hijoizquierdo.dato);
          }
          if(r.hijoderecho.dato<65){
                System.out.println("Dato menor a 65: " + r.hijoderecho.dato);
          }
          
          if (r.dato<65){
            System.out.println("Dato menor a 65: " +raiz.dato);
        
          }
          }else System.out.println("No hay datos menores a 65");

    
    
}
public nodoArbol buscarnodoMen (int d){
    nodoArbol aux = raiz;
    while(aux.dato!=d){
        if(d<aux.dato){
           
            aux=aux.hijoizquierdo;
             
        }else {
            aux=aux.hijoderecho;
            
        }
        if(aux==null){
            System.out.println("Nodo NO ENCONTRADO :( "); 
            return null;
        }
    }
    System.out.println("Nodo ENCONTRADO :)");
    return aux;
}
public nodoArbol buscarnodoMay (int d){
    nodoArbol aux = raiz;
    while(aux.dato!=d){
        if(d>aux.dato){
           
            aux=aux.hijoderecho;
             
        }else {
            aux=aux.hijoizquierdo;
            
        }
        if(aux==null){
            System.out.println("Nodo NO ENCONTRADO :( "); 
            return null;
        }
    }
    System.out.println("Nodo ENCONTRADO :)");
    return aux;
}

public void eliminar(int dato)throws Exception{
    raiz = eliminarNodo(raiz,dato);
    
}
protected nodoArbol eliminarNodo(nodoArbol aux, int dato)throws Exception{
    if ( aux == null){
        throw new Exception("Nodo no encontrado");
        
    } else if (dato < aux.dato){
        nodoArbol iz = eliminarNodo(aux.hijoizquierdo, dato);
        aux.hijoizquierdo=iz;
    } else if (dato> aux.dato){
        nodoArbol der = eliminarNodo(aux.hijoderecho, dato);
        aux.hijoderecho=der;
    }else {
        nodoArbol p = aux;
        if ( p.hijoderecho==null){
            aux = p.hijoizquierdo;
        }else if (p.hijoizquierdo==null){
            aux=p.hijoderecho;
        }else {
            p = cambiar(p);
        }
        p= null;
    }
    return aux;
    
}
protected nodoArbol cambiar(nodoArbol aux){
    nodoArbol p= aux;
    nodoArbol a = aux.hijoizquierdo;
    while (a.hijoderecho!=null){
        p = a ;
        a= a.hijoderecho;
        
    }
   aux.dato=a.dato;
   if (p== aux){
       p.hijoizquierdo=a.hijoizquierdo;
   }else 
       p.hijoderecho=a.hijoizquierdo;
       return a;
   }
public int alturaArbol(nodoArbol arbol){
    int Altizq, altDer, c=0;
    
    if ( arbol == null){
        return -1;
        
    }else{
        Altizq = alturaArbol (arbol.hijoizquierdo);
        altDer = alturaArbol (arbol.hijoderecho);
        c++;
        if (c==numNod){
            System.out.println("Altura izquierda"+(Altizq+1));
            System.out.println("Altura derecha"+(altDer+1));
           if ( Altizq >altDer){
               System.out.println("Altura total" + (Altizq + 1 + 1));
           }else{
               System.out.println("Altura total" + (altDer +1 +1));
           }
        
    }
        if (Altizq>altDer){
            return Altizq + 1;
        }else{
            return altDer;
        }
}

}
public int nivel(){
    int cont=0;
    int cont2=0;
    if (estaVacio()==false){
        nodoArbol aux=raiz;
        if(aux.hijoizquierdo!=null){
            while(aux.hijoizquierdo!=null || aux.hijoderecho!=null){
                if (aux.hijoizquierdo!=null){
                    aux=aux.hijoizquierdo;
                    cont++;
                }else{
                    if(aux.hijoderecho!=null){
                        aux=aux.hijoderecho;
                        cont++;
                    }
                }
            }
        }
        aux= raiz;
        if(aux.hijoderecho!=null){
            while(aux.hijoizquierdo!=null || aux.hijoderecho!=null){
                if(aux.hijoderecho!=null){
                    aux=aux.hijoderecho;
                    cont2++;
                }else{
                    if(aux.hijoizquierdo!=null){
                        aux=aux.hijoizquierdo;
                        cont2++;
                    }
                }
                    
            }
        }
        if (cont<cont2){
            System.out.println("EL NIVEL total es:" + (cont2));
            return cont2+1;
           
        }else{
            System.out.println("EL NIVEL total es:" + (cont));
            return cont+1;
        }
    }
    return 0;
}
public int altura(){
    int cont=0;
    int cont2=0;
    if (estaVacio()==false){
        nodoArbol aux=raiz;
        if(aux.hijoizquierdo!=null){
            while(aux.hijoizquierdo!=null || aux.hijoderecho!=null){
                if (aux.hijoizquierdo!=null){
                    aux=aux.hijoizquierdo;
                    cont++;
                }else{
                    if(aux.hijoderecho!=null){
                        aux=aux.hijoderecho;
                        cont++;
                    }
                }
            }
        }
        aux= raiz;
        if(aux.hijoderecho!=null){
            while(aux.hijoizquierdo!=null || aux.hijoderecho!=null){
                if(aux.hijoderecho!=null){
                    aux=aux.hijoderecho;
                    cont2++;
                }else{
                    if(aux.hijoizquierdo!=null){
                        aux=aux.hijoizquierdo;
                        cont2++;
                    }
                }
                    
            }
        }
        if (cont<cont2){
            System.out.println("La altura total es:" + (cont2+1));
            return cont2+1;
           
        }else{
            System.out.println("La altura total es:" + (cont+1));
            return cont+1;
        }
    }
    return 0;
}
public int altura2(){
    int cont=0;
    int cont2=0;
    if (estaVacio()==false){
        nodoArbol aux=raiz;
        if(aux.hijoderecho!=null){
            while(aux.hijoderecho!=null || aux.hijoizquierdo!=null){
                if (aux.hijoderecho!=null){
                    aux=aux.hijoderecho;
                    cont++;
                }else{
                    if(aux.hijoizquierdo!=null){
                        aux=aux.hijoizquierdo;
                        cont++;
                    }
                }
            }
        }
        aux= raiz;
        if(aux.hijoizquierdo!=null){
            while(aux.hijoderecho!=null || aux.hijoizquierdo!=null){
                if(aux.hijoizquierdo!=null){
                    aux=aux.hijoizquierdo;
                    cont2++;
                }else{
                    if(aux.hijoderecho!=null){
                        aux=aux.hijoderecho;
                        cont2++;
                    }
                }
                    
            }
        }
        if (cont<cont2){
            System.out.println("LA ALTURA total es:" + (cont2+1));
            return cont2+1;
           
        }else{
            System.out.println("LA ALTURA total es:" + (cont+1));
            return cont+1;
        }
    }
    return 0;
}
public int nivel2(){
    int cont=0;
    int cont2=0;
    if (estaVacio()==false){
        nodoArbol aux=raiz;
        if(aux.hijoderecho!=null){
            while(aux.hijoderecho!=null || aux.hijoizquierdo!=null){
                if (aux.hijoderecho!=null){
                    aux=aux.hijoderecho;
                    cont++;
                }else{
                    if(aux.hijoizquierdo!=null){
                        aux=aux.hijoizquierdo;
                        cont++;
                    }
                }
            }
        }
        aux= raiz;
        if(aux.hijoizquierdo!=null){
            while(aux.hijoderecho!=null || aux.hijoizquierdo!=null){
                if(aux.hijoizquierdo!=null){
                    aux=aux.hijoizquierdo;
                    cont2++;
                }else{
                    if(aux.hijoderecho!=null){
                        aux=aux.hijoderecho;
                        cont2++;
                    }
                }
                    
            }
        }
        if (cont<cont2){
            System.out.println("EL NIVEL total es:" + (cont2));
            return cont2+1;
           
        }else{
            System.out.println("EL NIVEL total es:" + (cont));
            return cont+1;
        }
    }
    return 0;
}
}
