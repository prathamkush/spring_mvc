package org.spring.mvc.validation;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Constraint(validatedBy = HeadToHeadConstraintValidator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface HeadToHead {

    public String message() default "value must have digits in ##-## format.";

    public Class<?> [] groups() default {};

    public Class<? extends Payload> [] payload() default {};


}
