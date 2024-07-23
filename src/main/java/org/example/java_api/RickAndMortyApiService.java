package org.example.java_api;

import org.example.java_api.record.RickAndMortyApiResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class RickAndMortyApiService {

    private final RestClient restClient;

    //    = RestClient.builder()
//        .baseUrl("https://api.rickandmarty.com")
//        .build();
    public RickAndMortyApiService() {
        restClient = RestClient.builder()
                .baseUrl("https://rickandmortyapi.com/api/")
                .build();
    }

    public List<RickAndMortyCharacter> loadAllCharacter() {
        RickAndMortyApiResponse responseBody = restClient
                .get()
                .uri("/character")
                .retrieve()
                .body(RickAndMortyApiResponse.class);
        return responseBody.results();
    }
}
