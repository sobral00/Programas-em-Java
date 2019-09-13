package com.mycompany.mavenproject1;

import java.util.Scanner;

//Treino de entrada e saida de dados em java!

public class NewClass {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int v1,v2,r;
        
        System.out.println("Digite os numeros para soma: ");
        v1 = ler.nextInt();
        v2 = ler.nextInt();
        
        r= v1+v2;
        
        System.out.println("A soma de "+v1+" e "+v2+" é igual a "+r+".");
    }
          
}
