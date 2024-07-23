package org.example.java_api.record;

import org.example.java_api.RickAndMortyCharacter;

import java.util.List;

public record RickAndMortyApiResponse(

        RickAndMortyResponseInfo info,
        List<RickAndMortyCharacter> results

) {
}
