package guru.springframework.jokesapp.controller;

import guru.springframework.jokesapp.service.GetJokeService;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    private final GetJokeService getJokeService;

    public MainController(GetJokeService getJokeService) {
        this.getJokeService = getJokeService;
    }

    @RequestMapping("/")
    public String MainPage(Model model){
        String joke = getJokeService.getRandomJoke();
        model.addAttribute("joke", joke);
        return "main";
    }
}
