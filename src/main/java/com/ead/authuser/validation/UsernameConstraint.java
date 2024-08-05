package com.ead.authuser.validation;

import org.springframework.context.annotation.Configuration;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = UsernameConstraintImpl.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface UsernameConstraint {

    String message() default "Invalid username!";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
