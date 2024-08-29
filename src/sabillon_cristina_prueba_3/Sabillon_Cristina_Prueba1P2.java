/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sabillon_cristina_prueba_3;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Laura Sabillon
 */
public class Sabillon_Cristina_Prueba1P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        
        String ArregloA [], ArregloB[], alreves = "", palabra = "";
        char letras = 0;
        int tamaño = 0;
        boolean encontrado = false;
                        
        String Palabras[] = { "radar", "level", "world", "civic", "java", "deified", "python", 
            "rotor", "language", "madam", "refer", "stats", "noon", "hello", "moon", "wow", "racecar", "kayak", "apple", "deed" };
        
        System.out.println("Lista de Palabras:");
        
        for (int indice = 0; indice < Palabras.length; indice++) {
            System.out.println( "[" + indice + "]: " + Palabras[indice]);
        }
        
        System.out.println("\nFavor ingresar el tamano de los arreglos");
        tamaño = scan.nextInt();
       
        ArregloA = new String [tamaño];
        ArregloB = new String [tamaño];
        
        System.out.println("\nLista Palabras Palindroma arreglo A:");
        for (int indice = 0; indice < ArregloA.length; indice++) {
            alreves = "";

            int  random_num =  random.nextInt(Palabras.length);
            palabra = Palabras[random_num];
            ArregloA [indice] = palabra;
            
            for (int index = palabra.length() - 1; index >= 0; index--) {
                alreves += palabra.charAt(index);
            }
            
            if (alreves.equals(palabra) && ArregloA[indice] != null){
                ArregloA [indice] = palabra;
            }
            
            System.out.println( "[" + indice + "]: " + ArregloA[indice]);
        }
        
        System.out.println("\nLista Palabras Palindroma arreglo B:");
        for (int indice = 0; indice < ArregloB.length; indice++) {
            int  random_num =  random.nextInt(Palabras.length);
            palabra = Palabras[random_num];
            alreves = "";
            ArregloB [indice] = palabra;
            
            for (int index = palabra.length() - 1; index >= 0; index--) {
                alreves += palabra.charAt(index);
            }
            
            if (alreves.equals(palabra)&& ArregloB[indice] != null){
            ArregloB [indice] = palabra;
            }
            System.out.println( "[" + indice + "]: " + ArregloB[indice]);          
        }
        
        System.out.println("\nPalabras del Arreglo A que no estan en el Arreglo B son:");

        for (int indice = 0; indice < ArregloA.length; indice++) {
            for (int index = 0; index < ArregloB.length; index++) {
                if (ArregloA[indice] != null && ArregloA[indice].equals(ArregloB[indice])) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("[" + indice + "]: " + ArregloA[indice]);
            }
        }
    }    
}
