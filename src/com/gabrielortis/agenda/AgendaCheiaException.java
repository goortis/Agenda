package com.gabrielortis.agenda;

@SuppressWarnings("serial")
public class AgendaCheiaException extends Exception {

	public String getMessage() {
		return "Agenda já está cheia";

	}
}
