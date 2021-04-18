package com.example.TacoCloud;

import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;

import javax.validation.constraints.*;

@Data
public class Order {

    @NotBlank(message = "Required Field")
    @Size(min = 5, message = "Must be atleast 5 characters long")
    private String name;

    @NotBlank(message = "Required Field")
    private String street;

    @NotBlank(message = "Required Field")
    private String city;

    @NotBlank(message = "Required Field")
    private String state;


    @Digits(integer = 5, fraction = 0, message = "Invalid Zip Code")
    private int zip;

    @CreditCardNumber(message = "Invalid credit card number")
    private String ccNumber;

    @Pattern(regexp = "^[0-9][0-9]/[0-9][0-9]$", message = "Invalid expiration date")
    private String ccExpiration;


    @Digits(integer = 3, fraction = 0, message = "Invalid CVV")
    private int ccCVV;
}
