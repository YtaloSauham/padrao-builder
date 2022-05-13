package demo;

import builders.ClientBuilder;
import director.Director;
import entidades.Cliente;

public class Main {
	public static void main(String[] args) {
		Director director1 = new Director();
		Director director2 = new Director();
		Director director3 = new Director();
		
		ClientBuilder builder = new ClientBuilder();
		ClientBuilder builder2 = new ClientBuilder();
		ClientBuilder builder3 = new ClientBuilder();
		
		director1.ContatoCompleto(builder);
		director2.ContatoInternet(builder2);
		director3.ContatoTelefone(builder3);
		
		Cliente cliente1 = builder.getResult();
		Cliente cliente2 = builder2.getResult();
		Cliente cliente3 = builder3.getResult();
		
		System.out.println("Cliente 1: \n "+ cliente1+ "\n");
		System.out.println("Cliente 2: \n"+ cliente2 +"\n");
		System.out.println("Cliente 3: \n"+ cliente3 +"\n");
		
		
		
	}
	}


