package OO;

public class Pessoa {
    private String nome;
    private int idade;
    private int cpf;
    static int contadorIdosos = 0;

    public Pessoa(String nome, int idade, int cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        if (idade > 60) {
            contadorIdosos++;
        }
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nIdade: " + idade + "\nCPF: " + cpf;
    }

    public int getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
