package executaLog.exibelog.console;

import com.eduardocia.geraLog.LogPrinter;

public class ConsoleLogScreen implements LogPrinter {

	@SuppressWarnings("unused")
	private String mensagem;

	public ConsoleLogScreen(String mensagem) {
		this.mensagem = mensagem;
	}

	@Override
	public void Print(String mensagem) {
		System.out.println("Saíndo na Tela a mensagem:" + mensagem);
	}

}
