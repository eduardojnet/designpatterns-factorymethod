package executaLog.exibelog.printer;

import com.eduardocia.geraLog.LogPrinter;

public class ConsoleLogPrinter implements LogPrinter {
	
	@SuppressWarnings("unused")
	private String mensagem;
	
	public ConsoleLogPrinter(String mensagem) {
		this.mensagem = mensagem;
	}
	
	@Override
	public void Print(String mensagem) {
		System.out.println("Saíndo na Impressora a mensagem:" + mensagem);
	}
	
	

}
