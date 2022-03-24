package com.infosharecomacademy.jsonfromurl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Data {

    private static final Logger LOGGER = LoggerFactory.getLogger(Data.class);

    public String getData(URI uri) {
        HttpResponse<String> httpResponse;
        HttpClient client = HttpClient.newHttpClient();
        String body = null;

        LOGGER.info("Info");

        HttpRequest httpRequest = HttpRequest
                .newBuilder()
                .uri(uri)
                .header("Accept", "application/json")
                .GET()
                .build();

        try {
            httpResponse = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            if (httpResponse.statusCode() == 200) {
                body = httpResponse.body();
            }
        } catch (IOException e) {
            LOGGER.info("Error", e);
        } catch (InterruptedException ie) {
            LOGGER.info("Error", ie);
        }
        return body;
    }
}
