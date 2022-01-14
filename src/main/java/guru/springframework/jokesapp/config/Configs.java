package guru.springframework.jokesapp.config;

import guru.springframework.jokesapp.service.GetJokeService;
import guru.springframework.jokesapp.service.GetJokeServiceImpl;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configs {

    @Bean
    ChuckNorrisQuotes chuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }

    @Bean
    GetJokeService getJokeService(ChuckNorrisQuotes c){
        return new GetJokeServiceImpl(c);
    }
}
