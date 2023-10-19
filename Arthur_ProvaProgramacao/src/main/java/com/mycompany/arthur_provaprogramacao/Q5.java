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
public class Q5 {
     
    public static void main(String[] args) throws IOException {
        
        DataInputStream dado;
        
        float vetor[] = new float [100];
        String escolha;
        float qtd,total=0,media;
        
        /*
        
        qtd = quantidade
        
        */
        
        System.out.println("Digite uma quantidade de 0 a 100 para utilizar");
        dado = new DataInputStream(System.in);
        escolha = dado.readLine();
        qtd = Float.parseFloat(escolha);
        
        System.out.println(" \nAgora informe esse valores ! \n");
        
        for (int i = 0; i < qtd; i++) {
            
              dado = new DataInputStream(System.in);
              escolha = dado.readLine();
              vetor[i] = Float.parseFloat(escolha);
        }
        
        for (int i = 0; i < qtd; i++) {
            
            total = total + vetor[i];       
            
        }
        
        media = total/qtd;
        
        System.out.println("A media: "+media+" Total: "+total);
        
    }    
    
}
