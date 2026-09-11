package txt;

public class Pessoa {
    private int id;
    private String nome;
    private String linguagemDeProgramacao;
    private int pontuacao;

    public Pessoa(int id, String nome, String linguagemDeProgramacao, int pontuacao) {
        this.id = id;
        this.nome = nome;
        this.linguagemDeProgramacao = linguagemDeProgramacao;
        this.pontuacao = pontuacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLinguagemDeProgramacao() {
        return linguagemDeProgramacao;
    }

    public void setLinguagemDeProgramacao(String linguagemDeProgramacao) {
        this.linguagemDeProgramacao = linguagemDeProgramacao;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public void apresentarPessoa() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Linguagem de programação: " + linguagemDeProgramacao);
        System.out.println("Pontuação: " + pontuacao);
        System.out.println();
    }
}
