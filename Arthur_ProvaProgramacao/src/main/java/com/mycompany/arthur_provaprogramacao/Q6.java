/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arthur_provaprogramacao;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author aoliveira
 */
public class Q6 {
    
    
    public static void main(String[] args) throws IOException {
        
        DataInputStream dado;
        String escolha,pista1,pista2,filme,tentativa;
        String player1,player2;
        int aux = 0;
        
        
        
        System.out.println("Digite seu nome: ");
         dado = new DataInputStream(System.in);
         escolha = dado.readLine();
         player1 = escolha;     
        
        System.out.println("O nome do filme:");
         dado = new DataInputStream(System.in);
         escolha = dado.readLine();
         filme = escolha; 
          
        System.out.println("Digite uma pista: ");
         dado = new DataInputStream(System.in);
         escolha = dado.readLine();
         pista1 = escolha; 
                
        System.out.println("Digite outra pista: ");
         dado = new DataInputStream(System.in);
         escolha = dado.readLine();
         pista2 = escolha; 
        
        System.out.println("\n------------------------------------------");
         System.out.println("\n--------------------------------------------");
        System.out.println("\n------------------------------------------\n");
        
        System.out.println("Digite seu nome: ");
         dado = new DataInputStream(System.in);
         escolha = dado.readLine();
         player2 = escolha;     
        
        System.out.println("A primeira pista e: "+pista1);
        
        System.out.println("Faça uma tentativa: ");
         dado = new DataInputStream(System.in);
         escolha = dado.readLine();
         tentativa = escolha;
         
        if (tentativa == filme){ 
            
            System.out.println("Aeeeeeee você acertou !");           
            aux = 1;
            
        }else{
            
            System.out.println("Você errou !!!");
            
        }
        
        if(aux == 0){
            
            
          System.out.println("A Segunda pista e: "+pista2);
        
          System.out.println("Faça uma tentativa: ");
          dado = new DataInputStream(System.in);
          escolha = dado.readLine();
          tentativa = escolha;
            
            
                  if (tentativa == filme){ 
            
            System.out.println("Aeeeeeee você acertou !");           
            aux = 1;
            
        }else{
            
            System.out.println("Você errou !!!");
            
        }
          
            
        }
                

    }
    
}
