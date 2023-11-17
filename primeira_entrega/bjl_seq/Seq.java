package primeira_entrega;

import java.util.Scanner; 
import java.lang.Math;

public class Seq {
    
    public static void ex1(){
        Scanner reader = new Scanner(System.in);  
        System.out.println("Informe quatro números, em sequência:");
        int soma = 0;

        for(int i = 0; i < 4; i++) soma += reader.nextInt();
        
        System.out.println("Resultado da soma: " + soma);

        reader.close();
    }

    public static void ex2(){
        Scanner reader = new Scanner(System.in);  
        System.out.println("Informe três notas, em sequência:");
        float soma = 0;
        for(int i = 0; i < 3; i++) soma += reader.nextFloat();
        
        System.out.println("Média aritmética: " + soma/3);

        reader.close();
    }

    public static void ex3(){
        Scanner reader = new Scanner(System.in);  
        System.out.println("Insira o salário:");
        float salario = reader.nextFloat();
        
        System.out.println("Novo salário: " + salario*1.25);

        reader.close();
    }

    public static void ex4(){
        Scanner reader = new Scanner(System.in);  
        
        System.out.println("Insira a base:");
        float base = reader.nextFloat();
        System.out.println("Insira a altura:");
        float altura = reader.nextFloat();
        
        System.out.println("Area do triangulo: " + base*altura/2);

        reader.close();
    }


    public static void ex5(){
        Scanner reader = new Scanner(System.in);  
        
        System.out.println("Insira o primeiro número:");
        float num1 = reader.nextFloat();
        System.out.println("Insira o segundo número:");
        float num2 = reader.nextFloat();
        
        System.out.println("Resultado: " + Math.pow(num1, num2));

        reader.close();
    }

    public static void main(String[] args) {
        ex5();
    }
}
