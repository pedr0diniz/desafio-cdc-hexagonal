package br.com.zinid.returnal.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = UniqueFieldValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface UniqueField {

    String message() default "is already in use";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default{};

    String fieldName();

    Class<?> entityClass();

}
