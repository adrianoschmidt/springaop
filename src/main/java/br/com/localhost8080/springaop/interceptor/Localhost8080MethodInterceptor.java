package br.com.localhost8080.springaop.interceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

@Component
public class Localhost8080MethodInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("Inicio da interceptacao do metodo: " + invocation.getMethod().getName());

		InterceptadoPorLocalhost8080 p = invocation.getMethod().getAnnotation(InterceptadoPorLocalhost8080.class);
		String parametroQualquer = p.parametroQualquer();
		System.out.println("Parametro utilizado na anotacao: " + parametroQualquer);

		Object retorno = null;
		try {
			retorno = invocation.proceed();
		} catch (Exception e) {
			System.out.println("Fazendo algo se o metodo lancou exception " + e);
		}

		System.out.println("Fazendo algo no final do metodo: ");

		return retorno;
	}

}
