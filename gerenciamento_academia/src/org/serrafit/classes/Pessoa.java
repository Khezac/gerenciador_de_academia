package org.serrafit.classes;

import java.time.LocalDate;

import org.serrafit.menu.Menu;

public abstract class Pessoa{
	private String nome;
	private String cpf;
	private LocalDate dataNascimento;
	private String contato;
	private String senha;

	// Construtor
	public Pessoa(String nome, String cpf, LocalDate dataNascimento, String contato, String senha) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.contato = contato;
		this.senha = senha;
	}

	// Get & Set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	// Métodos
	public String toString() {
		return String.format("""
				Nome: %s
				CPF: %s
				D.Nascimento: %s
				Contato: %s
				Senha: %s
				""", nome, cpf, dataNascimento, contato, senha);
	}

}
