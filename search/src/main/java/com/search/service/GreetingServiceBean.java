package com.search.service;

import com.google.common.collect.Lists;
import com.search.Greeting;
import com.search.GreetingRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingServiceBean implements GreetingService {

    @Autowired
    private GreetingRepository repository;
    private GreetingService repository1;

    @Override
    public List<Greeting> getAll() {
        return Lists.newArrayList(repository.findAll());
    }

    @Override
    public Greeting findOne(String id) {
        return repository1.findOne(id);
    }

    @Override
    public Greeting create(Greeting greeting) {
        return repository.save(greeting);
    }

    @Override
    public Greeting update(Greeting greeting) {
        Greeting persitedGreeting = repository1.findOne(greeting.getId());
        if(persitedGreeting == null) {
            return null;
        }
        return repository.save(greeting);
    }

    @Override
    public List<Greeting> getGreetingByUsername(String username) {
        return repository.findByUsername(username);
    }

    @Override
    public void delete(String id) {
        repository1.delete(id);
    }
}
