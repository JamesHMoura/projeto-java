package ecommerce.model;

public abstract class Instrumento {
	
	private String nome;
	private int id;
	private String marca;
	private float preco;
	private int tipo;
	private String cor;
	private int estoque;
	
	public Instrumento(String nome,int id, String marca, float preco, int tipo, String cor, int estoque) {
		
		this.nome = nome;
		this.id = id;
		this.marca = marca;
		this.preco = preco;
		this.tipo = tipo;
		this.cor = cor;
		this.estoque = estoque;
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


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public float getPreco() {
		return preco;
	}


	public void setPreco(float preco) {
		this.preco = preco;
	}


	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public int getEstoque() {
		return estoque;
	}


	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}


	//metodo de vender uma quantidade de itens
	public boolean sell(int quantidade) {
		if (this.getEstoque() < quantidade) {
			System.out.println("\nProduto Indisponível no momento!");
			return false;
		}
		
		this.setEstoque(this.getEstoque() - quantidade);
		return true;
	}
	
	public void buy(int quantidade) {
		
		this.setEstoque(this.getEstoque() + quantidade);
		
	}
	
	public void visualizar() {
		String tipo = "";
		
		switch(this.tipo) {
		case 1:
			tipo = "corda";
			break;
		case 2:
			tipo = "teclado";
			break;
		}
		System.out.print("""
				|------------------------------|
				|INSTRUMENTO CADASTRADO        |
				|------------------------------|
				""");
		System.out.println("|Nome do Instrumento: " + this.nome);
		System.out.println("|ID de Cadastro: "+ this.id);
		System.out.println("|Preço - R$: "+ this.preco);
		System.out.println("|Tipo: " + tipo);
		System.out.println("|Cor: "+ this.cor);
		System.out.println("|Disponíveis em estoque: "+ this.estoque);
		
		
	}
	
	

	
	
}