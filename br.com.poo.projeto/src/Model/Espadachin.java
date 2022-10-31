package Model;

import Interface.IEspadachinHabilidades;

public class Espadachin extends Lutador implements IEspadachinHabilidades {

    public Espadachin(String nome, int idade, String sexo, int altura, int peso, String nacionalidade) {
        super(nome, idade, sexo, altura, peso, nacionalidade);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public int getIdade() {
        return super.getIdade();
    }

    @Override
    public void setIdade(int idade) {
        super.setIdade(idade);
    }

    @Override
    public String getSexo() {
        return super.getSexo();
    }

    @Override
    public void setSexo(String sexo) {
        super.setSexo(sexo);
    }

    @Override
    public float getAltura() {
        return super.getAltura();
    }

    @Override
    public void setAltura(int altura) {
        super.setAltura(altura);
    }

    @Override
    public float getPeso() {
        return super.getPeso();
    }

    @Override
    public void setPeso(int peso) {
        super.setPeso(peso);
    }

    @Override
    public String getNacionalidade() {
        return super.getNacionalidade();
    }

    @Override
    public void setNacionalidade(String nacionalidade) {
        super.setNacionalidade(nacionalidade);
    }

    @Override
    public void ataqueNormal() {
        super.ataqueNormal();
    }

    @Override
    public void defender() {
        super.defender();
    }

    @Override
    public void contraGolpe() {
        System.out.println(this.nome + " contra atacou o adversario com sua espada!" + "\n");
    }

    @Override
    public void corteTransversal() {
        System.out.println(this.nome + " realizou um corte no adversario!" + "\n" );
    }

    @Override
    public void chuvaDeLaminas() {
        System.out.println(this.nome + " realizou uma sequencia de golpes no adversario!"+ "\n");
    }
    @Override
    public String toString() {
        return "Nome: " +this.nome+ "\nIdade: " +this.idade+ "\nSexo: " +this.sexo+ "\nAltura(cm): " +this.altura+
                "\nPeso: " +this.peso+ "\nNacionalidade: " +this.nacionalidade;
    }
}
