package ecommerce.repository;

import ecommerce.model.Instrumento;

public interface LojaRepository {
	
	//Metodos CRUD
	public void procurarPorID(int id);
	public void listarInstrumentos();
	public void cadastrarInstrumento(Instrumento instrumento);
	public void atualizarInstrumento(Instrumento instrumento);
	public void deletar(int id);
	
	//Metodos Atualização de produtos 
	public void sell (int id, int quantidade);
	public void buy (int id, int quantidade);


}
