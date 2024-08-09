public class AliancaVizinho implements EstrategiaStrategy{

    @Override
    public void atacar(Pais inimigo) {
        System.out.println("\n Vizinho ataca pelo norte e nós atacamos pelo sul");

    }

    @Override
    public void concluir(Pais inimigo) {
        System.out.println("\n Final da Guerra-Dividir beneficios");
        System.out.println("\n Final da Guerra-Dividir reconstrução");


    }
}
