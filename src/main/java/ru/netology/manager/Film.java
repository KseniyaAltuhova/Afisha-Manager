package ru.netology.manager;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public class Film {
    private int id;
    private String filmName;
    private String filmGenre;
}