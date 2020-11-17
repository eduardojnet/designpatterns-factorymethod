package executaLog;

import executaLog.exibelog.console.ConsoleLogCreatorScreen;
import executaLog.exibelog.console.ConsoleLogScreen;
import executaLog.exibelog.printer.ConsoleLogCreator;

public class CalculadoraDeImpostos {

	public static void main(String[] args) {
		ConsoleLogCreatorScreen logScreenCreator = new ConsoleLogCreatorScreen(null);
		logScreenCreator.log("Listando boletos na Impressora");
		
		
		ConsoleLogCreator logPrint = new ConsoleLogCreator(null);
		logPrint.log("Listando boletos na Tela");
	}

}
