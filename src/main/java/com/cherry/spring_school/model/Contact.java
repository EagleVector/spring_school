package com.cherry.spring_school.model;
import lombok.Data;

@Data
public class Contact {
    private String name;
    private String mobileNum;
    private String email;
    private String subject;
    private String message;
}

// Lombok library saves most of the code
// by providing getters, setters and toString operation
// directly into the byte code. Implemented just with annotations.