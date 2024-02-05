package OO;

public class Main {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João", 20, 123456789);
        Pessoa p2 = new Pessoa("Maria", 70, 987654321);
        Pessoa p3 = new Pessoa("José", 80, 123123123);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("Número de idosos: " + Pessoa.contadorIdosos);
    }
}
