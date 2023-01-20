package com.example.app.classes;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Competitor {
    @Id
    private String id;
    private String name;
    private String country;
    private String countryCode;
    private String abbreviation;
    private String qualifier;
    private String gender;
}
