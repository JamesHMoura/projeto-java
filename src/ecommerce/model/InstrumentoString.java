package ecommerce.model;

public class InstrumentoString extends Instrumento{

	private int qntCordas;
	private int modelo;
	
	public InstrumentoString(String nome, int id, String marca, float preco, int tipo, String cor, int estoque,int qntCordas
			,int modelo) {
		super(nome, id, marca, preco, tipo, cor, estoque);
		this.qntCordas = qntCordas;
		this.modelo = modelo;
	}
	

	public int getQntCordas() {
		return qntCordas;
	}


	public void setQntCordas(int qntCordas) {
		this.qntCordas = qntCordas;
	}


	public int getModelo() {
		return modelo;
	}


	public void setModelo(int modelo) {
		this.modelo = modelo;
	}


	@Override
	public void visualizar() {
		String modelo = "";
		switch(this.modelo) {
		
		case 1:
			modelo = "Acoustic";
			break;
		case 2: 
			modelo ="Eletronic";
			break;
		}
		super.visualizar();
		System.out.println("|Modelo com "+qntCordas + " Cordas");
		System.out.println("|Modelo: "+ modelo+"\n");
	}
	
}
