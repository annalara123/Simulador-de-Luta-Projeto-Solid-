package Model;

import Interface.IGeral;

public class Lutador  implements IGeral {

    String nome;
    int idade;
    String sexo;
    int altura;
    int peso;
    String nacionalidade;

    public Lutador(String nome, int idade, String sexo, int altura, int peso, String nacionalidade) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }


    @Override
    public void ataqueNormal() {
        System.out.println(this.nome + " atacou o adversario "+ "\n");
    }

    @Override
    public void defender() {
        System.out.println(this.nome +" se defendeu "+ "\n");
    }
    @Override
    public String toString() {
        return "Nome: " +this.nome+ "\nIdade: " +this.idade+ "\nSexo: " +this.sexo+ "\nAltura(cm): " +this.altura+
                "\nPeso: " +this.peso+ "\nNacionalidade: " +this.nacionalidade;
    }
}
