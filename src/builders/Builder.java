package builders;

import enums.TipoContato;

public interface Builder{
	void setTipoContato(TipoContato tipo);
	void setNome(String nome);
	void setTelefone(int telefone);
	void setEmail(String email);
	void setEndereco(String endereco);
}