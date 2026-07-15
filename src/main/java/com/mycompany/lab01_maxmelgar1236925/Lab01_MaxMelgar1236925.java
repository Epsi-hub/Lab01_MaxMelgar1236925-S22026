/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab01_maxmelgar1236925;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Lab01_MaxMelgar1236925 {

    public static void main(String[] args) {
        System.out.println("Lab01 Max Andrés Melgar castillo");
        
        ABB ArbolBinario = new ABB();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        ArbolBinario.Insertar(225);
        ArbolBinario.Insertar(146);
        ArbolBinario.Insertar(4);
        ArbolBinario.Insertar(399);
        ArbolBinario.Insertar(300);
        
        ArbolBinario.Insertar(800);
        ArbolBinario.Insertar(601);
        ArbolBinario.Insertar(862);
        ArbolBinario.Insertar(815);
        ArbolBinario.Insertar(888);
        
        do {
            System.out.println("\n 1.Insertar \n  2.Buscar \n  3.Eliminar \n  4.Recorridos  \n 5.Salir \n");
            System.out.print("Opción: \n");
            opcion = Integer.parseInt(scanner.nextLine());
            
            switch (opcion) {
                case 1:
                    System.out.print("Valor: ");
                    ArbolBinario.Insertar(Integer.parseInt(scanner.nextLine()));
                    break;
                case 2:
                    System.out.print("Valor: ");
                    if (ArbolBinario.Busqueda(Integer.parseInt(scanner.nextLine()))  == true) {
                        System.out.println("El valor existe");
                    } else {
                        System.out.println("El valor no existe");
                    }
                    break;
                case 3:
                    System.out.print("Valor: ");
                    int valor = Integer.parseInt(scanner.nextLine());
                    if (ArbolBinario.Busqueda(valor)) {
                        ArbolBinario.Eliminar(valor);
                        System.out.println("El valor ha sido eliminado");
                    } else {
                        System.out.println("El valor no ha sido eliminado debido a que no existe");
                    }
                    break;
                case 4:
                    System.out.print("Preorder: ");
                    ArbolBinario.Preorder();

                    System.out.print("Inorder: ");
                    ArbolBinario.Inorder();

                    System.out.print("PostOrder: ");
                    ArbolBinario.PostOrder();
                    break;
                    
                case 5:
                    System.out.println("Ejecución finalizada");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
            
        } while (opcion != 5);
      
    }
}
