package com.example.demo.service;

import com.example.demo.domain.Movie;
import com.example.demo.domain.MovieEvent;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MovieService {
    Mono<Movie> getMovieById(String id);
    Flux<Movie> getAllMovie();
    Flux<MovieEvent> streamMovieEvents(String id);
}
