package NivelIntermediario.Desafios.Desafio4;

public class Main {
    public static void main(String[] args) {
        NinjaBasico RockLee = new NinjaBasico("Rock Lee",20,TipoDeHabilidade.TAIJUTSU);
        RockLee.mostrarInformacoes();
        RockLee.executarHabilidade();

        NinjaAvancado Sasuke = new NinjaAvancado("Sasuke Uchiha",15,TipoDeHabilidade.TAIJUTSU, TipoDeHabilidade.RINNENGAN);
        Sasuke.mostrarInformacoes();
        Sasuke.executarHabilidade();
    }
}
