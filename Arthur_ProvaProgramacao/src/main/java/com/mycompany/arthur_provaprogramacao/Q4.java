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
public class Q4 {
    
    public static void main(String[] args) throws IOException {
        
        DataInputStream dado;
        String escolha;
        int aux = 0;
        float usuario = 1, senha = 1;
        
       while(aux == 0) { 
        
        System.out.println("Digite o usuário: ");
        dado = new DataInputStream(System.in);
        escolha = dado.readLine();
        usuario = Float.parseFloat(escolha);
        
            if(usuario == 1234){
                
                aux = 1;
                
            }else{
                    
                    
                   System.out.println("Usuario Invalido");
                    
            }
           
       } 
       
       while(aux == 1){
           
          System.out.println("Digite a senha: ");
          dado = new DataInputStream(System.in);
          escolha = dado.readLine();
          senha = Float.parseFloat(escolha); 
           
            if(senha == 9999){
                
                aux = 0;
                
            }else{
                    
                    
                 System.out.println("Senha Incorreta");
                    
            }
          
       }
        
        
    }
    
}
