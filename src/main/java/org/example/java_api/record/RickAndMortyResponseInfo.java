package org.example.java_api.record;

public record RickAndMortyResponseInfo(
        int count,
        int pages,
        String next,
        String prev
) {
}
