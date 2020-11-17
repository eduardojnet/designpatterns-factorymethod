package executaLog.exibelog.printer;

import com.eduardocia.console.Logger;
import com.eduardocia.geraLog.LogPrinter;

public class ConsoleLogCreator extends Logger{

	private String mensagem;
	
	public ConsoleLogCreator(String mensagem) {
		this.mensagem = mensagem;		
	}
	
	@Override
	protected LogPrinter createLogger() {
		return new ConsoleLogPrinter(mensagem);
	}
	
}
