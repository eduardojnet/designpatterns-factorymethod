package com.eduardocia.console;

import com.eduardocia.geraLog.LogPrinter;

public abstract class Logger {
	protected abstract LogPrinter createLogger();
	
	public boolean log(String mensagem) {
		System.out.println("Log da mensagem...");
		System.out.println(mensagem);
		System.out.println();

		return true;
		
	}
}
