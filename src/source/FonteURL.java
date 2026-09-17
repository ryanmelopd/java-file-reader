package source;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

// IOException: pode acontecer um erro durante a comunicação
// InterruptedException: a requisição pode ser interrompida
public class FonteURL {
    public String buscar(String url) throws IOException, InterruptedException {
        // Cria um cliente HTTP
        HttpClient client = HttpClient.newHttpClient();

        // Começa a construir a requisição HTTP
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url)) // Define o endereço para onde a requisição será enviada, transformando a String em uma URI
                .GET() // Define a requisição GET
                .build(); // Finaliza a construção da requisiçaõ

        // Constrói resposta do servidor
        HttpResponse<String> response = client.send(
                request, // Envia a requisição
                HttpResponse.BodyHandlers.ofString() // Define que a resposta seja convertida para String
        );

        // Status de código
        System.out.println("Status: " + response.statusCode());

        // Retorna a resposta do servidor
        return response.body();
    }
}
