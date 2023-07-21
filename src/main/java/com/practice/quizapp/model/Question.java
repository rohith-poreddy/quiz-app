package com.practice.quizapp.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
//@Table(name = "question")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String questionTitle;

    private String option1;

    private String option2;

    private String option3;

    private String option4;

    private String difficultyLevel;

    private String rightAnswer;

    private String category;




}
