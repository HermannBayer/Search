package com.search;

import com.search.service.GreetingService;
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

/*
    @ResponseBody
    @RequestMapping(value = "/greetings", method = RequestMethod.GET)
    public ResponseEntity<List<Greeting>> getAll() {
        return new ResponseEntity<List<Greeting>>(greetingService.getAll(), HttpStatus.OK);
    }

    @ResponseBody
    @RequestMapping(value = "/greetings", method = RequestMethod.POST)
    public ResponseEntity<Greeting> insertGreeting(@RequestBody Greeting greeting) {
        return new ResponseEntity<Greeting>(greetingService.create(greeting), HttpStatus.CREATED);
    	
    }

    @ResponseBody
    @RequestMapping(value = "/greetings", method = RequestMethod.PUT)
    public ResponseEntity<Greeting> updateGreeting(@RequestBody Greeting greeting) {
        return new ResponseEntity<Greeting>(greetingService.update(greeting), HttpStatus.MOVED_PERMANENTLY);
    }

    @ResponseBody
    @RequestMapping(value = "/greetings/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Greeting> deleteGreeting(@PathVariable("id") String idd) {
        greetingService.delete(idd);
        return new ResponseEntity<Greeting>(HttpStatus.NO_CONTENT);
    }

    @ResponseBody
    @RequestMapping(value = "/greetings{id}", method = RequestMethod.POST)
    public ResponseEntity<Greeting> getOne(@PathVariable("id") String idd) {
        return new ResponseEntity<Greeting>(greetingService.findOne(idd), HttpStatus.OK);
    }

    @ResponseBody
    @RequestMapping(value = "/greetings/{name}", method = RequestMethod.GET)
    public ResponseEntity<List<Greeting>> getByUserName(@PathVariable("name") String name) {
        return new ResponseEntity<List<Greeting>>(greetingService.getGreetingByUsername(name), HttpStatus.OK);
    }
*/
}