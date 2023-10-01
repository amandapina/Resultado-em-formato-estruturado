import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String formato;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o formato desejado: Pode ser XML, JSON ou YAML");
        formato = scanner.nextLine();

        VeiculoEletrico veiculo = new VeiculoEletrico();
        UF uf = new UF();

        veiculo.modelo = "modelo";
        veiculo.marca = "marca";
        veiculo.preco = 50000;
        veiculo.velMax = 150;
        veiculo.autonomia = 100;

        uf.cidade3 = "cidade3";
        uf.cidade2 = "cidade2";
        uf.cidade1 = "cidade1";
        uf.area = 100000;
        uf.capital = "capital";
        uf.coordenadas = 12222;
        uf.densidade = 34;
        uf.nome = "nome";
        uf.sigla = "UF";
        uf.populacao = 233333;

        Formatador formatador;
        switch (formato)
        {
            case "XML":
                formatador = new FormatadorXML();
                break;
            case "JSON":
                formatador = new FormatadorJson();
                break;
            case "YAML":
                formatador = new FormatadorYaml();
                break;
        }

        System.out.println(formatador.formatar(veiculo));
        System.out.println(formatador.formatar(uf));




    }
}