package org.example.java_api;

import org.example.java_api.record.RickAndMortyResponseOrigin;

public record RickAndMortyCharacter(
    int id,
    String name,
    String status,
    String species,
    RickAndMortyResponseOrigin origin
) {
}
