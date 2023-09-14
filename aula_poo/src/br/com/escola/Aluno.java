package br.com.escola;

public class Aluno { // Classe aluno
    //criar atributos da classe aluno
    private String nome;
    private String RA;
    private float notaAV1;
    private float notaAV2; // private significa atributo privado

    public Aluno(String nome, String RA, float notaAV1, float notaAV2) { // criação do construtor alt + insert
        this.nome = nome;
        this.RA = RA;
        this.notaAV1 = notaAV1;
        this.notaAV2 = notaAV2;
    }

    public Aluno() { // criação de construtor vazio - não possui parâmetros
        /*this.nome = ""; //criados de forma opcional - não é obrigatório
        this.RA = "";
        this.notaAV1 = 0;
        this.notaAV2 = 0;*/
    }

    public Aluno(String nome, String RA) {
        this.nome = nome;
        this.RA = RA;
    }

    public String getNome() { //criação do get por meio alt + insert
        return nome; // get gera um retorno
    }

    public String getRA() {
        return RA;
    }

    public float getNotaAV1() {
        return notaAV1;
    }

    public float getNotaAV2() {
        return notaAV2;
    }

    public void setNome(String nome) { // criação de set por meio de alt + insert
        this.nome = nome; // set é para alterar o atributo
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public void setNotaAV1(float notaAV1) {
        this.notaAV1 = notaAV1;
    }

    public void setNotaAV2(float notaAV2) {
        this.notaAV2 = notaAV2;
    }
}

