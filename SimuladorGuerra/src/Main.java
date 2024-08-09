public class Main {
    public static void main(String[] args) {
        Pais pais1 = new Pais("Brasil", 250000, false);
        Pais pais2 = new Pais("EUA", 50000, true);

        if(pais1.getQntdSoldados() > pais2.getQntdSoldados()){
            pais1.setEstrategia(new AtacarSozinho());
            pais1.DeclararGuerra(pais2);
        }else{
            pais1.setEstrategia(new Diplomacia());
            pais1.DeclararGuerra(pais2);
        }
    }
}
