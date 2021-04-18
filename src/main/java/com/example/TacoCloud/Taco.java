package com.example.TacoCloud;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
public class Taco {

    @NotNull(message = "Choose atleast one ingredient")
    private List<String> ingredients;

    @NotNull(message = "You must name your Taco")
    @Size(min = 5, message = "Must be atleast 5 characters long")
    private String name;
}
