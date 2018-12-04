package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;
// CLASSE QUE SIMULA UM BD
public class Banco {
	
	private static List<Empresa> list = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("Google");
		empresa.setId(chaveSequencial++);
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Facebook");	
		empresa2.setId(chaveSequencial++);
		Banco.list.add(empresa);
		Banco.list.add(empresa2);
	}
	
	public void adiciona(Empresa empresa) {
		Banco.list.add(empresa);
		empresa.setId(chaveSequencial++);
	}
	
	public void remove(Integer id) {
        list.removeIf(empresa -> empresa.getId() == id);
    }
	
	public List<Empresa> getEmpresas(){
		return Banco.list;
	}

	public Empresa findById(Integer id) {
		for (Empresa empresa : list) {
			if(empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
	}
}
