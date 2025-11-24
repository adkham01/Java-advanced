package com.Core.Java.Anonotatoin.testcom.Core.java.test;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Documented
@Inherited
@Target({ TYPE, FIELD, METHOD })
public @interface Course {
	String cid() default "C-111"; 
	String cname() default "Java";
	int ccost() default 10000;
}
