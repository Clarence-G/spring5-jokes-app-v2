package guru.springframework.jokesapp.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetJokeServiceImplTest {
    GetJokeServiceImpl service;

    @BeforeEach
    void setUp() {
        service = new GetJokeServiceImpl();
    }

    @Test
    void getRandomJoke() {
        for (int i = 0; i < 10; i++) {
            System.out.println(service.getRandomJoke());
        }
    }
}