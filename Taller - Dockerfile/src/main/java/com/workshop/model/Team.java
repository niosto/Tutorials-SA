package com.workshop.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;

@Entity
@Table(name = "team")
@Data // Generate getters and setters for all fields using lombok
@AllArgsConstructor // Generate a contrustuctor with all the fields
@NoArgsConstructor // Generates a constructor with no fields acordding to JPA
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    @NotBlank(message = "El nombre es obligatorio")
    private String name;
    
    @Column(nullable = false)
    private boolean state;
    
    @Column(nullable = false)
    @NotBlank(message = "La ciudad es obligatorio")
    private String city;
    
    @Column(nullable = false)
    @Positive(message = "El año debe ser un número válido")
    @NotNull(message = "El año es obligatorio")
    private Integer foundYear;
    
    @Column(nullable = false)
    private String logo;
   
}
