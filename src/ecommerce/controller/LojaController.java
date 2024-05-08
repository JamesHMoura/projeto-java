package ecommerce.controller;

import java.util.*;

import ecommerce.model.Instrumento;
import ecommerce.repository.LojaRepository;

public class LojaController implements LojaRepository{
	
	private ArrayList<Instrumento> listarInstrumentos = new ArrayList<Instrumento>();
	int id = 0;
	
	@Override
	public void procurarPorID(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarInstrumentos() {
		
			
		
	}

	@Override
	public void cadastrarInstrumento(Instrumento instrumento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void AtualizarInstrumento(Instrumento instrumento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Deletar(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sell(int id, int quantidade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buy(int id, int quantidade) {
		// TODO Auto-generated method stub
		
	}

}
