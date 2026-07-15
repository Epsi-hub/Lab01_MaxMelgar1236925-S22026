/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab01_maxmelgar1236925;

/**
 *
 * @author Max
 */
public class ABB {
    private Nodo raiz;
    
    
    private boolean BusquedaInterna(Nodo actual, int valor){
        if (actual == null){
            return false;
        }
        
        if (actual.nodo == valor){
            return true;
        }
        
        if(valor < actual.nodo){
            return BusquedaInterna(actual.left,valor);
        } else {
            return BusquedaInterna(actual.right,valor);
        }
    }
    
    public boolean Busqueda(int valor){
        return BusquedaInterna(raiz, valor);
    }
    
    
    public void Insertar(int valor){
        if (Busqueda(valor) == true){
            System.out.print("El valor ya existe");
        } else {
           raiz = InsertarValor(raiz,valor);
        }
       
    }
    
    private Nodo InsertarValor(Nodo actual, int valor){
        if (actual == null){
            return new Nodo(valor);
        } else {
            if (valor < actual.nodo){
                actual.left = InsertarValor(actual.left, valor);
            } else if (valor > actual.nodo){
                actual.right = InsertarValor(actual.right, valor);
            }
            return actual;
        }
    }
    
    public void Inorder(){
        RecorridoInorder(raiz);
        System.out.println();
    }
    
    private void RecorridoInorder(Nodo actual){
        if(actual != null){
            RecorridoInorder(actual.left);
            System.out.print(actual.nodo + " ");
            RecorridoInorder(actual.right);
        }
    }
    
    public void Preorder(){
        RecorridoPreorder(raiz);
        System.out.println();
    }
    
    private void RecorridoPreorder(Nodo actual){
        if(actual != null){
            System.out.print(actual.nodo + " ");
            RecorridoPreorder(actual.left);
            RecorridoPreorder(actual.right);
        }
    }
    
    public void PostOrder(){
        RecorridoPostOrder(raiz);
        System.out.println();
    }
    
    private void RecorridoPostOrder(Nodo actual){
        if(actual != null){
            RecorridoPostOrder(actual.left);
            RecorridoPostOrder(actual.right);
            System.out.print(actual.nodo + " ");
        }
    }
    
    public void Eliminar(int valor){
        raiz = EliminarRecursiva(raiz,valor);
    }
    
    private Nodo EliminarRecursiva(Nodo actual, int valor){
        if (actual == null){
            return null;
        }
        if (valor < actual.nodo){
            actual.left = EliminarRecursiva(actual.left, valor);
        } else if (valor > actual.nodo){
            actual.right = EliminarRecursiva(actual.right, valor);
        } else {
            // Encontramos el nodo a eliminar
            if (actual.left == null && actual.right == null){
                return null;
            } else if (actual.right == null){
                return actual.left;
            } else if (actual.left == null){
                return actual.right;
            } else {
                Nodo sucesor = lowest(actual.right);
                actual.nodo = sucesor.nodo;
                actual.right = EliminarRecursiva(actual.right, sucesor.nodo);
            }
        }
        return actual;
    }
    
    public Nodo lowest(Nodo actual){
        
        while (actual.left != null){
            actual = actual.left;
        }
        return actual;
    }
}
