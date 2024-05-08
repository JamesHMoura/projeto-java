package ecommerce.controller;

import java.util.*;

import ecommerce.model.Instrumento;
import ecommerce.repository.LojaRepository;

public class LojaController implements LojaRepository{
	
	private ArrayList<Instrumento> listaInstrumentos = new ArrayList<Instrumento>();
	int id = 0;
	
	@Override
	public void procurarPorID(int id) {
		
	}

	@Override
	public void listarInstrumentos() {
		for (var i: listaInstrumentos) {
			i.visualizar();
		}
			
		
	}

	@Override
	public void cadastrarInstrumento(Instrumento instrumento) {
		listaInstrumentos.add(instrumento);
		System.out.println("Instrumento registrado com o ID: " + instrumento.getId());
		
		
	}

	@Override
	public void atualizarInstrumento(Instrumento instrumento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(int id) {
		var instrumento = buscarNaCollection(id);
		
		if (instrumento != null) {
			if(listaInstrumentos.remove(instrumento) == true) {
				System.out.println("O instrumento de ID: "+id+ " foi deletado do sistema!");
			}else {
				System.out.println("O ID:"+id+" não foi encontrado!");
			}
		}
		
	}

	@Override
	public void sell(int id, int quantidade) {
		var instrumento = buscarNaCollection(id);
		
		if (instrumento != null) {
			if(instrumento.sell(quantidade) == true) {
				System.out.println(quantidade + "Produtos vendodos!");
			}
		}else {
			System.out.println("Produto não encontrado");
		}
		
	}

	@Override
	public void buy(int id, int quantidade) {
		var instrumento = buscarNaCollection(id);
		
		if(instrumento != null) {
			instrumento.buy(quantidade);
			System.out.println(quantidade + " instrumentos adicionados ao estoque");
		}else {
			System.out.println("produto nao encontrado!");
		}
		
	}
	
	public int gerarId() {
		return ++ id;
	}
	public Instrumento buscarNaCollection(int numero) {
		for (var instrumento : listaInstrumentos) {
			if (instrumento.getId() == numero)
				return instrumento;
			}
		return null;
		
	}


}
