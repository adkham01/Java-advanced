package com.Core.Java.Anonotatoin.testcom.Core.java.test;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Repeatable(Courses.class)
@Documented
@Retention(RUNTIME)
@Target({METHOD })
public @interface Courses {
	Course [] value() default {};
}
