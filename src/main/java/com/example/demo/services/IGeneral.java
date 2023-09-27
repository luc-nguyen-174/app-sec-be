package com.example.demo.services;

import java.util.Optional;

public interface IGeneral<T> {
    Iterable<T> findAll();

    Optional<T> findById(Long id);

    T save(T t);

    void remove(Long id);
}
