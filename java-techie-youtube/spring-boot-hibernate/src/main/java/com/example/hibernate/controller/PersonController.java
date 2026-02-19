package com.example.hibernate.controller;

import com.example.hibernate.dao.PersonDao;
import com.example.hibernate.model.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PersonController {

    private final PersonDao dao;

    @PostMapping("save-person")
    public String savePerson(@RequestBody Person person) {
        dao.save(person);
        return "Success";
    }

    @GetMapping("get-person")
    public List<Person> getPersons() {
        return dao.getPersons();
    }

}
