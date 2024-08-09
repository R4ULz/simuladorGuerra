public class AtacarSozinho implements EstrategiaStrategy{
    @Override
    public void atacar(Pais inimigo) {
        plantarEvidenciasFalsas();
        soltarBombas();
        derrubarGoverno();
    }

    private void plantarEvidenciasFalsas() {
        System.out.println("Foram plantadas evidencias falsas na base inimiga");
    }

    private void soltarBombas() {
        System.out.println("fiuuuuu boooom");

    }

    private void derrubarGoverno() {
        System.out.println("caiu pelé");

    }

    @Override
    public void concluir(Pais inimigo) {
        System.out.println("\n Final da Guerra-Estabelecer novo governo");
    }
}
