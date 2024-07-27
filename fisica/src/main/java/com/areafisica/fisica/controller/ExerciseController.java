package com.areafisica.fisica.controller;

import com.areafisica.fisica.model.Exercise;
import com.areafisica.fisica.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercise")

public class ExerciseController {

    @Autowired
    private ExerciseService exerciseService;

    @PostMapping("/add")
    public String add(@RequestBody Exercise exercise) {
        exerciseService.saveExercise(exercise);
        return "Un nuevo ejercicio ha sido añadido";
    }
}
