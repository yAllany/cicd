package com.mycompany.mavenproject1;
import java.util.Scanner;
public class calculadora {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner (System.in);
        
        
        System.out.println("Qual conta deseja fazer?");
        
        System.out.println("1. Soma");  
        System.out.println("2. Subtração");
        System.out.println("3. Divisão");
        System.out.println("4. Multiplicação");
        
        System.out.println("Digite o numero da conta que deseja: ");
        int conta = sc.nextInt();
        
        System.out.println("Digite o primeiro numero: ");
        double num1 = sc.nextDouble();
        
        System.out.println("Digite o segundo numero: ");
        double num2 = sc.nextDouble();
        
        double resultado;
        
        switch (conta){
            case 1: 
                resultado = num1 + num2;
                System.out.println("Resultado "+ resultado);
            break;
        
            case 2:
               resultado = num1 - num2;
               System.out.println("Resultado "+ resultado);
            break;
            
            case 3:
               resultado = num1 / num2;
               System.out.println("Resultado "+ resultado);
            break;
            
            case 4: 
                resultado = num1 * num2;
                System.out.println("Resultado "+ resultado);
            break;
            
            default: 
                System.out.println("Conta não aceita");
            
        }
        
         sc.close();
        
        
    }
}
