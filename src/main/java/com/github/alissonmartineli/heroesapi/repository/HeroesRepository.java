package com.github.alissonmartineli.heroesapi.repository;

import com.github.alissonmartineli.heroesapi.document.Heroes;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface HeroesRepository extends ReactiveMongoRepository<Heroes, String> {

}
