package com.github.alissonmartineli.heroesapi.service;

import com.github.alissonmartineli.heroesapi.document.Heroes;
import com.github.alissonmartineli.heroesapi.repository.HeroesRepository;

import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class HeroesService {
    private final HeroesRepository heroesRepository;

    public HeroesService(HeroesRepository heroesRepository) {
        this.heroesRepository = heroesRepository;
    }

    public Flux<Heroes> findAll() {
        return heroesRepository.findAll();
    }

    public Mono<Heroes> findById(String id) {
        return heroesRepository.findById(id);
    }

    public Mono<Heroes> save(Heroes heroes) {
        return heroesRepository.save(heroes);
    }

    public Mono<Boolean> deleteById(String id) {
        heroesRepository.deleteById(id);
        return Mono.just(true);
    }
}
