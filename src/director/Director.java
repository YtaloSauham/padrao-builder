package director;

import builders.Builder;
import enums.TipoContato;

public class Director {

	public void ContatoInternet(Builder builder) {
		builder.setTipoContato(TipoContato.ContatoInternet);
		builder.setNome("maria");
		builder.setEmail("maria@hotmail.com");
		}
	
	public void ContatoTelefone(Builder builder) {
		builder.setTipoContato(TipoContato.ContatoTelefone);
		builder.setNome("maria");
		builder.setTelefone(999999);
		}
	
	public void ContatoCompleto(Builder builder) {
		builder.setTipoContato(TipoContato.ContatoCompleto);
		builder.setNome("maria");
		builder.setEndereco("Rua 2,Casa 7");
		builder.setTelefone(999999);
		builder.setEmail("maria@hotmail.com");
		}
}
