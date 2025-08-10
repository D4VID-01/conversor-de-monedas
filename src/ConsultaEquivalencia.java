import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaEquivalencia {

    public Divisa buscaConversion (String divisaBase, String divisaDestino) {

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/9eb57e74c100268c41b61401/pair/"
                + divisaBase + "/" + divisaDestino);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Divisa.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    public void mostrarMenu() {
        System.out.println("***********************************************");
        System.out.println("¡Sea bienvenido/a al Conversor de Divisa!\n");
        System.out.println("1) Dólar =>> Peso Méxicano");
        System.out.println("2) Peso Méxicano =>> Dólar");
        System.out.println("3) Dólar =>> Euro");
        System.out.println("4) Euro =>> Dólar");
        System.out.println("5) Peso Colombiano =>> Dólar");
        System.out.println("6) Dólar =>> Peso Colombiano");
        System.out.println("7) Salir\n");
        System.out.println("Elija una opción válida:");
        System.out.println("***********************************************");
    }
}
