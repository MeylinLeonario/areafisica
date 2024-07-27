package com.areafisica.fisica.service;

import com.areafisica.fisica.model.Exercise;

import java.util.List;

public interface ExerciseService {
    public Exercise saveExercise(Exercise exercise);
    public List<Exercise> getAllExercises();
}
