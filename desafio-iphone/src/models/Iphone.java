package models;

import interfaces.AparelhoTelefonico;
import interfaces.Browser;
import interfaces.ReprodutorMusical;

public class Iphone implements Browser, ReprodutorMusical, AparelhoTelefonico{
	private Long id;
	private String name;
	private String color;
	private String version;
	
	public Iphone() {
	}
	
	public Iphone(Long id, String name, String color, String version) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.version = version;
	}
	
	@Override
	public void exibirPagina(String url) {
		System.out.println("exibindo pagina: " + url);
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Abrindo nova aba!");		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando pagina!");
	}
	
	@Override
	public void tocarMusica() {
		System.out.println("Tocar Musica!");
	}

	@Override
	public void pausarMusica() {
		System.out.println("Pausar Musica!");		
	}

	@Override
	public void selecionarMusica(String name) {
		System.out.println("Selecionando musica: " + name);
	}
	
	@Override
	public void ligar(String number) {
		System.out.println("Ligando para o numero: " + number);
	}

	@Override
	public void atender(String number) {
		System.out.println("Atentendo o numero " + number);
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando Correio de voz!");
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}

}