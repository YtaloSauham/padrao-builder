package builders;

import entidades.Cliente;
import enums.TipoContato;

public  class ClientBuilder implements Builder {
	private TipoContato tipo;
	private String nome;
	private int telefone;
	private String email;
	private String endereco;
	
	
	
	@Override
	public void setTipoContato(TipoContato tipo) {
		// TODO Auto-generated method stub
		this.tipo = tipo;
		
	}
	@Override
	public void setNome(String nome) {
		// TODO Auto-generated method stub
		this.nome = nome;
		
	}
	@Override
	public void setTelefone(int telefone) {
		// TODO Auto-generated method stub
		this.telefone=telefone;
		
	}
	@Override
	public void setEmail(String email) {
		// TODO Auto-generated method stub
		this.email = email;
	} 
	
	@Override
	public void setEndereco(String endereco) {
		// TODO Auto-generated method stub
		this.endereco = endereco;
	} 
	
	public Cliente getResult() {
		return new Cliente(tipo, nome, telefone,email,endereco);
	}

	
}
