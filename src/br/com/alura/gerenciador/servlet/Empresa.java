package br.com.alura.gerenciador.servlet;

import java.util.Date;

//CLASSE POJO
public class Empresa {

	private int id;
	private String nome;
	private Date data = new Date();
	
	
	public void setData(Date data) {
		this.data = data;
	}
	
	public Date getData() {
		return data;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
