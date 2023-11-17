package primeira_entrega;

import java.util.Scanner; 

public class Conditions {
    

    public static void ex1(){
        Scanner reader = new Scanner(System.in);  

        System.out.println("Insira o primeiro número:");
        int number1 = reader.nextInt();
        System.out.println("Insira o segundo número:");
        int number2 = reader.nextInt();

        if(number1==number2){
            System.out.println("Os números sao iguais");
        } else {
            System.out.printf("O maior é: %d\n", number1>number2?number1:number2);
        }

        reader.close();
    }

    public static void ex2(){
        Scanner reader = new Scanner(System.in);  
        System.out.println("Insira o primeiro número:");
        int number1 = reader.nextInt();
        System.out.println("Insira o segundo número:");
        int number2 = reader.nextInt();
        System.out.println("Insira o terceiro número:");
        int number3 = reader.nextInt();

        System.out.println( number1 > number2 && number1 > number3 ? "Condiçao satisfeita":"Erro" );

        reader.close();
    }


    public static void ex3(){
        Scanner reader = new Scanner(System.in);  
        System.out.println("Insira um número:");
        int number1 = reader.nextInt();

        System.out.printf("%d %s\n", number1, number1 % 2 == 0 ? "é par":"é impar" );

        reader.close();
    }

    public static void ex4(){
        Scanner reader = new Scanner(System.in);  

        System.out.println("Insira o primeiro valor:");
        int number1 = reader.nextInt();
        System.out.println("Insira o segundo valor:");
        int number2 = reader.nextInt();

        if(number1==number2){
            System.out.printf("Multiplicaçao: %d", number1*number2);
        } else if(number1 > number2) {
            System.out.printf("Subtraçao: %d\n", number1-number2);
        } else {
            System.out.printf("Some: %d\n", number1+number2);
        }
        reader.close();
    }

    public static void ex5(){
        Scanner reader = new Scanner(System.in);  

        System.out.println("Digite 1 para somar;\nDigite 2 para subtrair;\nDigite 3 para multiplicar;\nDigite 4 para dividir;");
        int choice = reader.nextInt();
        
        System.out.println("Insira o primeiro valor:");
        int number1 = reader.nextInt();
        System.out.println("Insira o segundo valor:");
        int number2 = reader.nextInt();

        switch (choice) {
            case 1:
                System.out.printf("Soma: %d\n", number1+number2);
                break;
            case 2:
                System.out.printf("Subtraçao: %d\n", number1-number2);
                break;
            case 3:
                System.out.printf("Multiplicaçao: %d\n", number1*number2);
                break;
            case 4:
                if (number2==0){
                    System.out.println("Divisao por zero.");
                } else{
                    System.out.printf("Divisao: %d\n", number1/number2);
                }
                break;   
            default:
                System.out.println("Digite um valor válido");
                break;
        }
        reader.close();
    }

    public static void main(String[] args) {
        ex5();
    }
}
