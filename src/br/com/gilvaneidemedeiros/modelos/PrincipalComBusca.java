package br.com.gilvaneidemedeiros.modelos;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.jar.JarException;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        try (Scanner leitura = new Scanner(System.in)) {
        System.out.println("\nDigite um filme para busca: ");
        var busca = leitura.nextLine();

        String buscaCodificada = URLEncoder.encode(busca, StandardCharsets.UTF_8);
        String endereco = "http://www.omdbapi.com/?t=" + busca + "&apikey=9de8e5d7";

        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> resposta = cliente
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = resposta.body();
        System.out.println(json);

        Gson gson = new Gson();
        Titulo meuTituloOmdb = gson.fromJson(json, Titulo.class);
        System.out.println(meuTituloOmdb);

            Titulo tituloConvertido = new Titulo();
            System.out.println("Título já convertido");
            System.out.println(tituloConvertido);
            System.out.println("\n");
            System.out.println("Nome: " + tituloConvertido.getNome());
            System.out.println("Ano de lançamento: " + tituloConvertido.getAnoLancamento());
            System.out.println("Duração em minutos: " + tituloConvertido.getDuracaoEmMinutos());

        } catch (NumberFormatException e) {
            System.out.println("Aconteceu um erro de formatação de número ao converter os dados do filme.: ");
            System.out.println(e.getMessage());
        } catch (JarException e) {
            System.out.println("Aconteceu um erro ao processar a resposta JSON da API. Verifique se o filme foi encontrado ou se a resposta é válida. ");
            System.out.println("Detalhes: " + e.getMessage());
        } catch (IOException | InterruptedException e) {
            System.out.println("\nOcorreu um erro na comunicação com a API ou a operação foi interrompida.");
            System.out.println("Detalhes: " + e.getMessage());
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("\nErro nos dados fornecidos ou na construção do objeto Titulo.");
            System.out.println("Detalhes: " + e);
        }

        System.out.println("\nO programa finalizou corretamente!");

    }



}
