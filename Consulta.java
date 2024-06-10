import com.google.gson.Gson;
import com.sun.net.httpserver.HttpHandler;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Consulta{
    public Coin moneda(String envio, String llega) {
        URI conexion = URI.create("https://v6.exchangerate-api.com/v6/c34bb7c48d92c8642ac40ffe/pair/" + envio + "/" + llega + "/");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(conexion).build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Coin.class);
        } catch (Exception e) {
            throw new RuntimeException("Moneda no convertible");
        }
    }
}
