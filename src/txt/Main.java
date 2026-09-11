package txt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Path caminho = Path.of("data/dados.txt");

        boolean existe = Files.exists(caminho);

        if (existe) {
            System.out.println("Arquivo encontrado!");
            List<String> linhas = Files.readAllLines(caminho);

            System.out.println("Lendo arquivo...");
            List<Pessoa> pessoas = linhas.stream()
                    .map(linha -> new Pessoa(
                                    Integer.parseInt(linha.split(";")[0]),
                                    linha.split(";")[1],
                                    linha.split(";")[2],
                                    Integer.parseInt(linha.split(";")[3])
                            )
                    ).toList();

            System.out.println("\nInformações: ");
            for (Pessoa pessoa : pessoas) {
                pessoa.apresentarPessoa();
            }

        } else {
            System.out.println("Arquivo não encontrado!");
        }
    }
}
