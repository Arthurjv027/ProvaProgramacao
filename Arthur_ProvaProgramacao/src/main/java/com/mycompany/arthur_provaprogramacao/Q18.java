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
public class Q18 {
    
    
    public static void main(String[] args) throws IOException {
       
        DataInputStream dado;
        String escolha;
        float Hrtrabalhadas,Hrmes,total,ir,inss,sindic,SL;
        
        /*
        
        Hrtrabalhadas = Horas trabalhadas
        Hrmes = Horas trabalhas no mês
        ir = Imposto de renda
        sindic = Sindicato
        SL = Salário liquido
        
        */
        
        
        System.out.println("Digite aqui o quanto você ganha por horas trabalhas: ");
        dado = new DataInputStream(System.in);
        escolha = dado.readLine();
        Hrtrabalhadas = Float.parseFloat(escolha);
        
        System.out.println("Quantas horas você trabalha no mês");
        dado = new DataInputStream(System.in);
        escolha = dado.readLine();
        Hrmes = Float.parseFloat(escolha);       
                
        total = Hrtrabalhadas*Hrmes;
        ir = ((total*11)/100);
        inss = ((total*8)/100);
        sindic = ((total*5)/100);
        SL = total - ir - inss - sindic;
        
        
        System.out.println("\n----------------------------");
        System.out.println("Salário Bruto:      R$"+total);
        System.out.println("Imposto de Rende:   RS"+ir);
        System.out.println("INSS:               R$:"+inss);
        System.out.println("Sindicato           RS:"+sindic);
        System.out.println("----------------------------");
        System.out.println("Salário liquido   R$:"+SL);
    }
    
    
}
