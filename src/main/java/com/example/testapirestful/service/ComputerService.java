package com.example.testapirestful.service;


import com.example.testapirestful.model.Computer;
import com.example.testapirestful.repository.IComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.util.Optional;


@Service
public class ComputerService implements IComputerService{
    @Autowired
    private IComputerRepository iComputerRepository;


    @Override
    public Iterable<Computer> findAll() {
        return iComputerRepository.findAll();
    }


    @Override
    public Optional<Computer> findById(int id) {
        return iComputerRepository.findById(id);
    }


    @Override
    public Computer save(Computer computer) {
        return iComputerRepository.save(computer);
    }

    @Override
    public Page<Computer> findAll(Pageable pageable) {
        return iComputerRepository.findAll(pageable);
    }


    @Override
    public void remove(int id) {
        iComputerRepository.deleteById(id);
    }
}

