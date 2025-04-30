package NivelIntermediario.Desafios.Desafio4;

public class NinjaAvancado extends NinjaBasico implements Ninja{
    TipoDeHabilidade especialidade;

    public NinjaAvancado(String nome, int idade, TipoDeHabilidade habilidade, TipoDeHabilidade especialidade){
        super( nome, idade, habilidade);
        this.especialidade = especialidade;
    }
    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
    }
    @Override
    public void executarHabilidade() {
        super.executarHabilidade();
        System.out.println("E minha especialidade é " + especialidade);
    }
}
