package com.mks.result.controller;

import com.mks.result.entity.Student;
import com.mks.result.repository.Repo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class ResultController {
    @Autowired
    Repo repo;


    @PostMapping("/save")
    public ResponseEntity add(@RequestBody Student student)
    {

        try {
            //System.out.println("in try");
            return new ResponseEntity(repo.save(student), HttpStatus.OK);
        }
        catch (DataIntegrityViolationException r)
        {
            //System.out.println("in catch");
            return new ResponseEntity(r.getMessage(),HttpStatus.BAD_REQUEST);

        }
    }

    @GetMapping("/getResult/{usn}")
    public ResponseEntity getResult(@RequestParam("usn") String usn)
    {

            return new ResponseEntity(repo.findByUsn(usn), HttpStatus.OK);
    }
}
