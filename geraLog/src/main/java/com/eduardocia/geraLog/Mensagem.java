package com.eduardocia.geraLog;

import java.time.LocalDateTime;

public class Mensagem {
	private String mensagem;
	private LocalDateTime dataHoraMensagem;
	
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public LocalDateTime getDataHoraMensagem() {
		return dataHoraMensagem;
	}
	public void setDataHoraMensagem(LocalDateTime dataHoraMensagem) {
		this.dataHoraMensagem = dataHoraMensagem;
	}
	public Mensagem(String mensagem, LocalDateTime dataHoraMensagem) {
		super();
		this.mensagem = mensagem;
		this.dataHoraMensagem = dataHoraMensagem;
	}
				
}
