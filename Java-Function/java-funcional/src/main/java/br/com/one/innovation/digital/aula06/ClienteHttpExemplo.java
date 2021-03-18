package br.com.one.innovation.digital.aula06;

import java.io.IOException;
import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ClienteHttpExemplo {

    static ExecutorService executor = Executors.newFixedThreadPool(6, new ThreadFactory() {
        @Override
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            System.out.println("Nova Thread criada :: " + (thread.isDaemon() ? "demon" : "") + "ThreadGroup :: "+ thread.getThreadGroup());
            return thread;
        }
    });

    public static void main(String[] args) throws Exception {
        connectHttpAkamaiHttp2Client();
    }

//    private static void connectHttpAkamaiHttp11Client() throws Exception {
//        System.out.println("Running HTTP/1.1 exemplo ...");
//        try {
//            HttpClient httpClient = HttpClient.newBuilder()
//                    .version(HttpClient.Version.HTTP_1_1)
//                    .proxy(ProxySelector.getDefault())
//                    .build();
//
//            long start = System.currentTimeMillis();
//
//            HttpRequest request = HttpRequest.newBuilder()
//                    .uri(URI.create("https://http2.akamai.com/demo/h2_demo_frame.html"))
//                    .build();
//
//            HttpResponse response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
//
//            System.out.println("Status Code ::: " + response.statusCode());
//            System.out.println("Response Headers ::: " + response.headers());
//            String responseBody = (String) response.body();
//            System.out.println(responseBody);
//
//            List<Future<?>> future = new ArrayList<>();
//
//            responseBody
//                    .lines()
//                    .filter(line -> line.trim().startsWith("<img height"))
//                    .map(line -> line.substring(line.indexOf("src='")+5, line.indexOf("/>")))
//                    .forEach(image -> {
//                        Future<?> imgfuture = executor.submit(() -> {
//                           HttpRequest imageRequest = HttpRequest.newBuilder()
//                                   .uri(URI.create("https://http2.akamai.com/"+image))
//                                   .build();
//
//                            try {
//                                HttpResponse<String> imageResponse =  httpClient.send(imageRequest, HttpResponse.BodyHandlers.ofString());
//                                System.out.println("Image Carregada :: "+image+", status code :: "+imageResponse.statusCode());
//                            } catch (IOException | InterruptedException e) {
//                                System.out.println("Mensagem de error durante requisição para recuperar a imagem "+image);
//                            }
//                        });
//                        future.add(imgfuture);
//                        System.out.println("Submetida no futuro para imagem :: "+image);
//                    });
//
//            future.forEach(f -> {
//                try {
//                    f.get();
//                } catch (InterruptedException | ExecutionException e) {
//                    System.out.println("Erro ao esperar carregar imagem futura.");
//                }
//            });
//
//            long end = System.currentTimeMillis();
//            System.out.println("Tempo de carregamento total :: " + (end - start) + " ms");
//        } finally {
//            executor.shutdown();
//        }
//    }

    private static void connectHttpAkamaiHttp2Client() throws Exception {
        System.out.println("Running HTTP/1.1 exemplo ...");
        try {
            HttpClient httpClient = HttpClient.newBuilder()
                    .version(HttpClient.Version.HTTP_2)
                    .proxy(ProxySelector.getDefault())
                    .build();

            long start = System.currentTimeMillis();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://http2.akamai.com/demo/h2_demo_frame.html"))
                    .build();

            HttpResponse response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("Status Code ::: " + response.statusCode());
            System.out.println("Response Headers ::: " + response.headers());
            String responseBody = (String) response.body();
            System.out.println(responseBody);

            List<Future<?>> future = new ArrayList<>();

            responseBody
                    .lines()
                    .filter(line -> line.trim().startsWith("<img height"))
                    .map(line -> line.substring(line.indexOf("src='")+5, line.indexOf("/>")))
                    .forEach(image -> {
                        Future<?> imgfuture = executor.submit(() -> {
                            HttpRequest imageRequest = HttpRequest.newBuilder()
                                    .uri(URI.create("https://http2.akamai.com/"+image))
                                    .build();

                            try {
                                HttpResponse<String> imageResponse =  httpClient.send(imageRequest, HttpResponse.BodyHandlers.ofString());
                                System.out.println("Image Carregada :: "+image+", status code :: "+imageResponse.statusCode());
                            } catch (IOException | InterruptedException e) {
                                System.out.println("Mensagem de error durante requisição para recuperar a imagem "+image);
                            }
                        });
                        future.add(imgfuture);
                        System.out.println("Submetida no futuro para imagem :: "+image);
                    });

            future.forEach(f -> {
                try {
                    f.get();
                } catch (InterruptedException | ExecutionException e) {
                    System.out.println("Erro ao esperar carregar imagem futura.");
                }
            });

            long end = System.currentTimeMillis();
            System.out.println("Tempo de carregamento total :: " + (end - start) + " ms");
        } finally {
            executor.shutdown();
        }
    }

}
