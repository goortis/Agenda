package com.gabrielortis.agenda;

@SuppressWarnings("serial")
public class ContatoNaoExisteException extends Exception {
	private String nomeContato;

	public ContatoNaoExisteException(String nomeContato) {
		this.nomeContato = nomeContato;
	}

	@Override
	public String getMessage() {
		return "Contato " + nomeContato + " n�o existe na agenda.";
	}

}
