package NivelIntermediario.Desafios.Desafio4;

public class NinjaBasico implements Ninja {
    String nome;
    int idade;
    private TipoDeHabilidade habilidade;

    public NinjaBasico(String nome, int idade,TipoDeHabilidade habilidade){
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }
    @Override
    public void mostrarInformacoes(){System.out.println("Meu nome e " + nome + " e minha idade e " + idade);}
    @Override
    public void executarHabilidade(){System.out.println("E eu uso: " + habilidade);}
}
