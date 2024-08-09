public class Pais {

    private String nome;
    private int qntdSoldados;
    private boolean armaNuclear;
    private EstrategiaStrategy estrategia;

    public Pais(String nome, int qntdSoldados, boolean armaNuclear) {
        this.nome = nome;
        this.qntdSoldados = qntdSoldados;
        this.armaNuclear = armaNuclear;
    }

    public String getNome() {
        return nome;
    }

    public int getQntdSoldados() {
        return qntdSoldados;
    }

    public boolean isArmaNuclear() {
        return armaNuclear;
    }

    public EstrategiaStrategy getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(EstrategiaStrategy estrategia){
        this.estrategia = estrategia;
    }

    public void DeclararGuerra(Pais inimigo){
        this.estrategia.atacar(inimigo);
        this.estrategia.concluir(inimigo);

    }
}
