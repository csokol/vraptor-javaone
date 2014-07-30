package br.com.caelum.vraptor.javaone.interceptor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.interceptor.InterceptorBinding;

@Retention(RetentionPolicy.RUNTIME)
@InterceptorBinding
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface UsingTransaction {

}
