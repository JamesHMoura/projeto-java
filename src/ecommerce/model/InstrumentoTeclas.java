package ecommerce.model;

public class InstrumentoTeclas extends Instrumento{
	private int qntTeclas;
	public InstrumentoTeclas(String nome, int id, String marca, float preco, int tipo, String cor, int estoque,int qntTeclas) {
		super(nome, id, marca, preco, tipo, cor, estoque);
		this.qntTeclas = qntTeclas;
	}
	public int getQntTeclas() {
		return qntTeclas;
	}
	public void setQntTeclas(int qntTeclas) {
		this.qntTeclas = qntTeclas;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("|Modelo com "+qntTeclas + " Teclas\n");
	}
}
