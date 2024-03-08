package com.example.testapirestful.service;

import com.example.testapirestful.model.Computer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;


public interface IGeneralService<E> {
    Iterable<E> findAll();


    Optional<E> findById(int id);


    E save(E e);

    public Page<Computer> findAll(Pageable pageable);


    void remove(int id);
}

