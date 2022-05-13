package entidades;

import enums.TipoContato;

public class Cliente {
	private TipoContato tipo;
	private  String nome;
	private  int telefone;
	private  String email;
	private  String endereco;
	
	
	
	public Cliente(TipoContato tipo, String nome, int telefone, String email, String endereco) {
		
		this.tipo = tipo;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
	}
	
	public TipoContato getTipo() {
		return tipo;
	}
	public void setTipo(TipoContato tipo) {
		this.tipo = tipo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String toString() {
		String mensagem = "";
		
		if(this.tipo == tipo.ContatoCompleto) {
			mensagem +="Tipo de contato: "+ this.tipo +"\n";
			mensagem += "Nome: "+ this.nome +"\n";
			mensagem +="Telefone: "+this.telefone+"\n";
			mensagem +="Email: "+this.email+"\n";
			mensagem +="Endereco: "+this.endereco+"\n";
			
		}
		if(this.tipo == tipo.ContatoInternet) {
			mensagem +="Tipo de contato: "+ this.tipo +"\n";
			mensagem += "Nome: "+ this.nome+"\n";
			mensagem +="Email: "+this.email+"\n";
			
		}
		else {
			mensagem +="Tipo de contato: "+ this.tipo +"\n";
			mensagem += "Nome: "+ this.nome +"\n";
			mensagem +="Telefone: "+this.telefone+"\n";
			
		}
		return mensagem;
		
	}
	
	

}
