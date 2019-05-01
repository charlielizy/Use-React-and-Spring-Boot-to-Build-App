package com.example.codetest.controller;

import com.example.codetest.model.Car;
import com.example.codetest.service.CarShowsProcessor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class CarShowController {
	
    private CarShowsProcessor processor = new CarShowsProcessor();
    
    @GetMapping("/carshow")
    public List<Car> getCarAndShows(Model model) {
        return processor.processToCollection();
    }
}
