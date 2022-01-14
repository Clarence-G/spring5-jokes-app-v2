package guru.springframework.jokesapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public record GetJokeServiceImpl(
        ChuckNorrisQuotes chuckNorrisQuotes) implements GetJokeService {

    @Override
    public String getRandomJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
