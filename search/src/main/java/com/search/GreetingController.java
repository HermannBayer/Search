package com.search;


//import com.search.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GreetingController {

//    @Autowired
 //   private GreetingService greetingService;
   
    private final GreetingRepository greetingRepository;
    
    public GreetingController(GreetingRepository greetingRepository){
        this.greetingRepository = greetingRepository;
    }

    @GetMapping
    public Iterable<Greeting> findAll(){
        return greetingRepository.findAll();
    }

    
    @PostMapping("/greetings")
    public Greeting addUser(@RequestBody Greeting newGreeting) {
        return greetingRepository.save(newGreeting);
    }

    
}