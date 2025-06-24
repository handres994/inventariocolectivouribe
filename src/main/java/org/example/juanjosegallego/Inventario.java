package org.example.juanjosegallego;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Inventario {
    public static void main(String[] args) {

        //ENTRADAS
        Scanner keyEntry = new Scanner(System.in);
        Integer menuOption=null;
        String colorVerde="\u001B[32m";

        HashMap<String, Object> diccionario=new HashMap<>(); // creacion de objetos


        //PROCESO 1 (Crear el menu de opciones)
        System.out.println("\n******************");
        System.out.println("***** Uribe APP *****");
        System.out.println("******************");

        System.out.println("\n👕 Bienvenido a gestor de prendas...\n");
        System.out.println("¿Qué quieres realizar?");
        System.out.println(colorVerde+"1️⃣  Guardar una prenda en BD 📝");
        System.out.println("2️⃣  Mostrar el inventario de prendas 📦");
        System.out.println("3️⃣  Modificar los datos de una prenda ✏️");
        System.out.println("4️⃣  Eliminar una prenda del sistema 🗑️");
        System.out.println("5️⃣  Presiona 5 para SALIR ❌");

        System.out.println("Digita una opcion: ");
        menuOption=keyEntry.nextInt();

        while(true){
            ArrayList<Object> productos=new ArrayList<>(); //creacion de array
           try{

               if(menuOption==1) {
                   System.out.println("Regristrando producto inventario");
                   //agregando un elemento a una lista de java
                   //keyEntry.nextLine();
                   //productos.add(keyEntry.nextLine());
                   //mostrando una lista
                   //System.out.println(productos);

                   //llenando un diccionario
                   System.out.println("Digita el id del producto: ");
                   diccionario.put("id",keyEntry.nextInt());
                   System.out.println("Digita el precio del producto: ");
                   diccionario.put("precio",keyEntry.nextInt());
                   keyEntry.nextLine();
                   System.out.println("Digita el nombre del producto: ");
                   diccionario.put("producto",keyEntry.nextLine());

                   productos.add(diccionario);
                   System.out.println(diccionario);
               }
               else if(menuOption==2){
                   System.out.println("Mostrando el inventario");
                   System.out.println(productos);
               }
               else if(menuOption==3){
                   System.out.println("Modificando el producto");
               }
               else if(menuOption==4){
                   System.out.println("Eliminar un producto del inventario");
               }
               else if(menuOption==5){
                   System.out.println("Gracias por utilizar nuestra app");
                   break;
               }

               System.out.println("Ahora digita otra opcion: ");
               menuOption= keyEntry.nextInt();

           }catch(Exception error){
               System.out.println(error.getMessage());
           }
        }

        //PROCESO 2

        //PROCESO 3

        //SALIDAS

    }
}
