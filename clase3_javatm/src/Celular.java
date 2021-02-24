public class Celular implements Precedable<Celular> {

    private int numero;
    private String titular;

    public Celular(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public Celular() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    // compara alfabéticamente
    @Override
    public int precedeA(Celular celular) {
        return titular.compareToIgnoreCase(celular.getTitular());
    }

    @Override
    public String toString() {
        return
                "titular=" + titular +
                        ", numero='" + numero + '\'';
    }
}
