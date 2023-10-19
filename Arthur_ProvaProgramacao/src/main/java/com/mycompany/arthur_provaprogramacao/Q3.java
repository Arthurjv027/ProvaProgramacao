/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arthur_provaprogramacao;


import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author aoliveira
 */
public class Q3 {
    
    public static void main(String[] args) throws IOException {
     
        String s;
        float numero,sucessor,antecessor;
     
        s = JOptionPane.showInputDialog("Digite um numero:");
        numero = Float.parseFloat(s);

        System.out.println(numero);
        
        sucessor = numero + 1;
        antecessor = numero -1;
        
        JOptionPane.showMessageDialog(null,"O Sucessor:"+sucessor+" O antecessor:"+antecessor);

        
    }
    
}
