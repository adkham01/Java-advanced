package com.Core.Java.Anonotatoin.testcom.Core.java.test;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Documented
@Inherited
@Retention(RUNTIME)
@Target({ TYPE, FIELD, METHOD })
public @interface Restaurant {
	String id() default "R-111";
	String name() default "Paradise";
	String phone() default "123-456-789";
	String website() default "www.paradise.com";
}
