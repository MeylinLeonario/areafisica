package com.areafisica.fisica.controller;

import com.areafisica.fisica.model.Exercise;
import com.areafisica.fisica.repository.ExerciseRepository;
import com.areafisica.fisica.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exercise")

public class ExerciseController {

    @Autowired
    private ExerciseService exerciseService;
    @Autowired
    private ExerciseRepository exerciseRepository;

    @PostMapping("/add")
    public String add(@RequestBody Exercise exercise) {
        exerciseService.saveExercise(exercise);
        return "Un nuevo ejercicio ha sido añadido";
    }

    @GetMapping("/getAll")
    public List<Exercise> getAllExercises() {
        return exerciseService.getAllExercises();
    }
}
