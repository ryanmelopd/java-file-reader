import fileReader.LeitorTXT;
import source.FonteURL;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int opcaoEscolhida = opcao(input);

        List<String> linhas;

        if (opcaoEscolhida == 1) {
            linhas = lerArquivoLocal(input);

        } else if (opcaoEscolhida == 2) {
            linhas = lerArquivoURL(input);

        } else {
            System.out.println("Opção inválida!");
            input.close();
            return;
        }

        List<Map<String, String>> dados = lerTXT(linhas);
        exibirDados(dados);
        input.close();
    }

    public static int opcao(Scanner input) {
        System.out.println("====== JAVA FILE READER ======");
        System.out.println("Como deseja fornecer o arquivo?");
        System.out.println("1 - Arquivo local");
        System.out.println("2 - URL");
        System.out.print("Insira sua opção: ");
        return input.nextInt();
    }

    public static List<String> lerArquivoLocal(Scanner input) throws Exception {
        input.nextLine();

        System.out.print("Insira o caminho do arquivo: ");
        String caminhoArquivo = input.nextLine();

        Path caminho = Path.of(caminhoArquivo);

        if (Files.exists(caminho)) {
            System.out.println("Arquivo encontrado!");
            System.out.println("Lendo arquivo...");
            return Files.readAllLines(caminho);
        } else {
            System.out.println("Arquivo não encontrado!");
            return List.of();
        }
    }

    public static List<String> lerArquivoURL(Scanner input) throws Exception {
        input.nextLine();

        System.out.print("Digite a URL: ");
        String url = input.nextLine();

        FonteURL fonteURL = new FonteURL();

        System.out.println("Acessando URL...");
        String conteudo = fonteURL.buscar(url);
        return conteudo.lines().toList();
    }

    public static List<Map<String, String>> lerTXT(List<String> linhas) {
        LeitorTXT leitorTXT = new LeitorTXT();
        return leitorTXT.ler(linhas);
    }

    public static void exibirDados(List<Map<String, String>> dados) {
        System.out.println("\n========== INFORMAÇÕES ==========");
        for (Map<String, String> objeto : dados) {
            System.out.println("\n---------------------------------");
            for (Map.Entry<String, String> atributo : objeto.entrySet()) {
                System.out.println(atributo.getKey() + ": " + atributo.getValue());
            }
        }
        System.out.println("\n=================================");
    }
}