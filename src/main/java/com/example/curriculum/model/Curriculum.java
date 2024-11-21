package src.main.java.com.example.curriculum.model;

import jakarta.validation.constraints.*;

public class Curriculum {

    private Long id;

    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;

    @NotBlank(message = "El apellido es obligatorio")
    private String apellido;

    @NotBlank(message = "La fecha es obligatoria")
    private String fecha;

    @NotNull(message = "La edad es obligatoria")
    private Integer edad;

    @Email(message = "El correo debe ser válido")
    @NotBlank(message = "El correo es obligatorio")
    private String email;

    @NotBlank(message = "El número de contacto es obligatorio")
    private String numero;

    // Getters y Setters
}
