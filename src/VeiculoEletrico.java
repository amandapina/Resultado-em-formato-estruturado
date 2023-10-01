public class VeiculoEletrico {
    String modelo;
    String marca;
    double autonomia;
    double velMax;
    double preco;

    public String toString() {
        return "veiculo eletrico {" +
                "modelo:'" + modelo + '\'' +
                ", marca:'" + marca + '\'' +
                ", autonomia:" + autonomia +
                ", velocidade maxima" + velMax +
                ", preco:" + preco +
                '}';
    }
}