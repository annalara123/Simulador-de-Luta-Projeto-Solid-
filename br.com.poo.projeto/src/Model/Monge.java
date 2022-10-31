package Model;

import Interface.IMongeHabilidades;

public class Monge extends Lutador implements IMongeHabilidades {
    public Monge(String nome, int idade, String sexo, int altura, int peso, String nacionalidade) {
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
    public void meditar() {
        System.out.println(this.nome + " meditou e recuperou vida!" + "\n");
    }

    @Override
    public void chuteLunar() {
        System.out.println(this.nome + " usou o poder da lua e desferiu um chute no adversario!"+ "\n");
    }

    @Override
    public void socoSolar() {
        System.out.println(this.nome+" absorveu a energia do sol e desferiu um soco no adversario!"+ "\n");
    }

    @Override
    public String toString() {
        return "Nome: " +this.nome+ "\nIdade: " +this.idade+ "\nSexo: " +this.sexo+ "\nAltura(cm): " +this.altura+
                "\nPeso: " +this.peso+ "\nNacionalidade: " +this.nacionalidade;
    }
}
