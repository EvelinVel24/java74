package src.main.java.com.example.curriculum.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class AgeDateValidator implements ConstraintValidator<ValidAgeDate, Curriculum> {

    @Override
    public boolean isValid(Curriculum curriculum, ConstraintValidatorContext context) {
        // Implementar lógica para validar fecha y edad
        return true; // Cambiar por la lógica real
    }
}
