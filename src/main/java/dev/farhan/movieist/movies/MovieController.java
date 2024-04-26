package dev.farhan.movieist.movies;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api/v1/movíe")

public class MovieController {
    @GetMapping
    public String allMovies() {
        return "All Movies";
    }
    
}
