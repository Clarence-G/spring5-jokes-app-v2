package guru.springframework.jokesapp.service;

import org.springframework.stereotype.Service;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class GetJokeServiceImpl implements GetJokeService {
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public GetJokeServiceImpl() {
        chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getRandomJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
