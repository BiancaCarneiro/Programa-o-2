package segunda_entrega.bjl_rep;

import java.util.Scanner;

public class Rep {
    public static void q1(){
        int soma = 0;
        for (int i = 0; i < 11; i++) soma+=i;
        System.out.println("Somatório: " + soma);
    }

    public static void q2(){
        Scanner reader = new Scanner(System.in);  
        System.out.println("Insira o valor de A:");
        int number1 = reader.nextInt();
        System.out.println("Insira o valor de B:");
        int number2 = reader.nextInt();

        System.out.println("Série numérica:");
        for (int i = number1; i < number2; i++) System.out.printf("%d ", i);

        reader.close();
    }


    public static void q3(){
        Scanner reader = new Scanner(System.in);
        int num;
        int pos = 0;
        do{
            System.out.println("Insira um número:");
            num = reader.nextInt();
            if (num > 0) pos++;
        }  while (num != 0);

        System.out.printf("Quantidade de positivos: %d ", pos);

        reader.close();
    }

    public static void q4(){
        Scanner reader = new Scanner(System.in);  
        System.out.println("Insira o valor de A:");
        int number1 = reader.nextInt();
        System.out.println("Insira o valor de B:");
        int number2 = reader.nextInt();

        number1 = number1%2==0?number1+1:number1;

        for(int i=number1; i<number2+1; i=i+2) System.out.printf("É impar: %d\n", i);

        reader.close();
    }

    public static void q5(){
        Scanner reader = new Scanner(System.in);  

        System.out.println("Insira um número:");
        int number = reader.nextInt();

        for(int i = 2; i < number; i++){
            if (number % i == 0){
                System.out.printf("%d nao é primo\n", number);
                reader.close();
                return;
            }
        }
        System.out.printf("%d é primo\n", number);
        reader.close();
    }

    public static void main(String[] args) {
        q5();
    }
}
