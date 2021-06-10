package com.search.service;

import com.search.model.Greeting;
import java.util.List;

public interface GreetingService {
    List<Greeting> getAll();
    Greeting findOne(String id);
    Greeting create(Greeting greeting);
    Greeting update(Greeting greeting);
    List<Greeting> getGreetingByUsername(String username);
    void delete(String id);
}
