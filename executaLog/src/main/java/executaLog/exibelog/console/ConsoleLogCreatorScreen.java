package executaLog.exibelog.console;

import com.eduardocia.console.Logger;
import com.eduardocia.geraLog.LogPrinter;

public class ConsoleLogCreatorScreen extends Logger{

	private String mensagem;
	
	public ConsoleLogCreatorScreen(String mensagem) {
		this.mensagem = mensagem;		
	}
	
	@Override
	protected LogPrinter createLogger() {
		return new ConsoleLogScreen(mensagem);
	}
	
}