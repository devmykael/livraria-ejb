package br.com.caelum.timer;

import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton
@Startup
public class Agendador {
	
	@Schedule(hour = "*", minute = "*", second = "*/10", persistent = false)
	public void agendado() {
		System.out.println("Verificando servi�o externo periodicamente");
	}

}
