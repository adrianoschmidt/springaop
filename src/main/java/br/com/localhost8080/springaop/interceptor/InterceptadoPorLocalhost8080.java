package br.com.localhost8080.springaop.interceptor;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Voce apenas precisa adicionar essa anotacao no metodo que voce quer interceptar
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Inherited
@Documented
public @interface InterceptadoPorLocalhost8080 {

	/**
	 * Voce pode adicionar parametros para usar no seu interceptador.
	 */
	String parametroQualquer();

}
