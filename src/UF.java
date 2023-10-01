public class UF {

    String nome;
    String sigla;
    String capital;
    int coordenadas;
    double populacao;
    double area;
    double densidade;
    String cidade1;
    String cidade2;
    String cidade3;


    public String toString() {
        return "UF {" +
                "Nome='" + nome + '\'' +
                ", sigla:'" + sigla + '\'' +
                ", capital:'" + capital + '\'' +
                ", coordenadas :'" + coordenadas + '\'' +
                ", populacao:" + populacao +
                ", area:" + area +
                ", densidade:" + densidade +
                ", tres maiores cidades:" + cidade1 + cidade2 + cidade3 +
                '}';
    }

}
