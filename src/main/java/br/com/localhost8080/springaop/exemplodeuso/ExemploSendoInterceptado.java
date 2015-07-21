package br.com.localhost8080.springaop.exemplodeuso;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import br.com.localhost8080.springaop.interceptor.InterceptadoPorLocalhost8080;

/**
 * Minha classe de jobs que serao interceptados
 */
@Component
@EnableScheduling
public class ExemploSendoInterceptado {

	/**
	 * Esse eh um job que sera interceptado.
	 */
	@InterceptadoPorLocalhost8080(parametroQualquer = "valorDoParametro1")
	@Scheduled(fixedRate = 15000, initialDelay = 100000)
	public void metodo01() {
		System.out.println("Esse metodo sera interceptado");
	}

	/**
	 * Esse eh outro job que sera interceptado.
	 */
	@InterceptadoPorLocalhost8080(parametroQualquer = "valorDoParametro2")
	@Scheduled(fixedRate = 15000, initialDelay = 100000)
	public void metodo02() {
		System.out.println("Esse metodo sera interceptado tambem");
	}

}
