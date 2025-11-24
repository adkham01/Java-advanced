package com.Core.Java.Anonotatoin.testcom.Core.java.test;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target({ TYPE, METHOD })
@Documented
@Inherited
public @interface Insititute {
	String name() default "SAMDU";
	String website() default "www.samdu.uni.uzb";
	String phone() default "123-456-789";
	String branch() default "Samarkand";
}
