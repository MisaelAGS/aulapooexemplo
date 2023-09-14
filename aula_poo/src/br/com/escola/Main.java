package br.com.escola;

public class Main {
    public static void main(String[]args){
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Misael");
        aluno1.setRA("12118461");
        System.out.println("Aluno 1: " + aluno1.getNome() + "\n" + "RA: " + aluno1.getRA());
        aluno1.setNotaAV1(85);
        aluno1.setNotaAV2(85.9f); // encapsulamento - usando o método set para alterar
        Aluno aluno2 = new Aluno("Ana", "123444");
        System.out.println("Aluno 2: " + aluno2.getNome() + "\n" + "RA: " + aluno2.getRA());
        Aluno aluno3 = new Aluno("João", "7363636", 40.5f, 30.7f);
        System.out.println("Aluno 3: " + aluno3.getNome() + "\n" + "RA: " + aluno3.getRA() + "\n" + "Nota: " + (aluno3.getNotaAV1() + aluno3.getNotaAV2()));

    }
}