package com.gabrielortis.agenda;

public class Contato {

	private static int contador;
	private int id;
	private String nome;
	private String telefone;
	private String email;

	public Contato() {
		contador++;
		id = contador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Contato\nid: " + id + "\nnome: " + nome + "\ntelefone: " + telefone + "\nemail: " + email + "\n";
	}

}
