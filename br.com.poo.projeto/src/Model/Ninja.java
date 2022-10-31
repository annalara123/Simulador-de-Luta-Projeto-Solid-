package Model;

import Interface.INinjaHabilidades;
import org.w3c.dom.ls.LSOutput;

public class Ninja extends Lutador implements INinjaHabilidades {

    public Ninja(String nome, int idade, String sexo, int altura, int peso, String nacionalidade) {
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
    public void bombaDeFumassa() {
        System.out.println(this.nome + " soltou uma bomba de fumaca e cegou o adversario!"+ "\n");
    }

    @Override
    public void shuriken() {
        System.out.println(this.nome + " soltou uma shuriken no adversario!"+ "\n");
    }

    @Override
    public void puxarParaSombra() {
        System.out.println(this.nome + " puxou o adversario para a dimensao das sombras!"+ "\n");
    }

    @Override
    public String toString() {
        return "Nome: " +this.nome+ "\nIdade: " +this.idade+ "\nSexo: " +this.sexo+ "\nAltura(cm): " +this.altura+
                "\nPeso: " +this.peso+ "\nNacionalidade: " +this.nacionalidade;
    }
}
