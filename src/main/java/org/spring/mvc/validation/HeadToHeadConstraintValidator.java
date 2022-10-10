package org.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HeadToHeadConstraintValidator implements ConstraintValidator<HeadToHead, String> {

    @Override
    public void initialize(HeadToHead headToHeadScore) {
    }

    @Override
    public boolean isValid(String headToHeadScore, ConstraintValidatorContext constraintValidatorContext) {
        boolean result = headToHeadScore.matches("[0-9]{1,2}-[0-9]{1,2}");
        return result;
    }
}
