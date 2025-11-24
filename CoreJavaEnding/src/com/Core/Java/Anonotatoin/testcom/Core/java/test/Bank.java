package com.Core.Java.Anonotatoin.testcom.Core.java.test;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Inherited
@Documented
@Retention(RUNTIME)
@Target(TYPE)
public @interface Bank {
	String bid() default "B-111";
	String bname() default "IciciBank";
	String branch() default "Samarkand";
	String webSite() default "www.icicibank.com/Samarkand";
}
