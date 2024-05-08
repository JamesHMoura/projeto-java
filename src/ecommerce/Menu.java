package ecommerce;
import java.util.*;
import ecommerce.util.Cores;
import ecommerce.controller.LojaController;
import ecommerce.model.*;
import java.io.IOException;
public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		LojaController instrumentos = new LojaController();
		int opcao,id,quantidade ,tipo, estoque, qntCordas, qntTeclas, modelo, numero;
		String nome, marca, cor;
		float preco;
		
		
		while(true) {
			System.out.println(Cores.TEXT_BLUE_BRIGHT + Cores.ANSI_BLACK_BACKGROUND+"""
				*************************************************************************
				*                                                                       *
				*           STRINGS AND KEYS                                            *
				*                                                                       *
				*************************************************************************
				*                                                                       *
				*           1 - Cadastrar produto                                       *
				*           2 - Listar Produtos                                         *
				*           3 - Apagar Produto                                          *
				*           4 - Vender produto                                          *
				*           5 - Adicionar ao estoque                                    *
				*           6 - Sair                                                    *
				*                                                                       *
				*************************************************************************
		
				"""+Cores.TEXT_RESET);
			System.out.println(Cores.TEXT_BLUE_BRIGHT+"Entre com a opção desejada: "+Cores.TEXT_RESET);
			try {
				opcao = leia.nextInt();
			}catch(InputMismatchException e) {
				System.out.println(Cores.TEXT_RED+"\nDigite valores inteiros!");
				leia.nextLine();
				opcao=0;
			}
			
			
			if (opcao == 6) {
				System.out.println(Cores.TEXT_WHITE_BOLD+ "\nSTRINGS AND KEYS - Loja de Instrumentos!");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch(opcao) {
			case 1 -> {
				System.out.println("Dgite o nome do instrumento: ");
				nome = leia.next();
				System.out.println("Digite a marca do instrumento: ");
				marca = leia.next();
				System.out.println("Digite o preço do instrumento: ");
				preco = leia.nextFloat();
				System.out.println("Digite a cor do instrumento: ");
				cor = leia.next();
				System.out.println("Digite a quantidade de instrumentos: ");
				estoque = leia.nextInt();
				System.out.print("""
						-Tipo de Instrumento-
						
						1 - Instrumeto do corda
						2 - Instrumento de teclas
						>
						""");
				do {
					tipo = leia.nextInt();
					if(tipo != 1 && tipo != 2) {
						System.out.println("digite um tipo válido!!");
					}
				}while(tipo == 1 && tipo == 2);
				
				switch(tipo) {
				case 1->{ 
					System.out.println("Digite a quantidade de cordas do instrumento: ");
					qntCordas = leia.nextInt();
					
					System.out.print("""
							-Modelo-
							1 - Acoustic
							2 - Eletric
							>
							""");
					do {
						modelo = leia.nextInt();
						if(modelo != 1 && modelo != 2) {
							System.out.println("digite um tipo válido!!");
						}
					}while(modelo == 1 && modelo == 2);
					
					instrumentos.cadastrarInstrumento(new InstrumentoString(nome, instrumentos.gerarId(), marca, preco, tipo,cor, estoque,qntCordas, modelo));
					
					break;
				}
				case 2 ->{
					System.out.println("Digite a quantidade de teclas do instrumento: ");
					qntTeclas = leia.nextInt();
					instrumentos.cadastrarInstrumento(new InstrumentoTeclas(nome, instrumentos.gerarId(), marca, preco, tipo,cor, estoque,qntTeclas));
					break;
				}
				}
				
				KeyPress();
				break;
			}
			case 2 ->{ 
				System.out.println("Lista de Instrumentos Cadastrados: ");
				
				instrumentos.listarInstrumentos();
				KeyPress();
				break;
			}
			case 3 ->{
				System.out.println("Digite o ID do produto que deseja deletar do sistema: ");
				numero = leia.nextInt();
				instrumentos.deletar(numero);
				
				KeyPress();
				break;
			}
			case 4 -> {
				System.out.println("Código do produto a ser vendido: ");
				id = leia.nextInt();
				
				do {
					System.out.println("Digite a quantidade: ");
					quantidade  = leia.nextInt();
				}while(quantidade <= 0);
				instrumentos.sell(id, quantidade);
				
				KeyPress();
				break;
			}
			case 5->{
				System.out.println("ID do produto a adicionar estoque: ");
				id = leia.nextInt();
				
				do {
					System.out.println("Digite a quantidade que será adicionada: ");
					quantidade  = leia.nextInt();
				}while(quantidade <= 0);
				instrumentos.buy(id, quantidade);
				
				KeyPress();
				break;
			}
			
			default->{
				System.out.println(Cores.TEXT_WHITE_BOLD+"\nOpção Inválida !\n");
				
				KeyPress();
				break;
			}
			}
		
		}
		
	}
	
	public static void KeyPress() {
		try {
			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();
		}catch(IOException e) {
			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	}
	
	
	public static void sobre() {
		System.out.println(Cores.TEXT_YELLOW+"""
				
				*********************************************************
				Projeto Desenvolvido por:
				James Moura - james.moura@genstudents.org
				https://github.com/JamesHMoura
				*********************************************************
				""");
	}

}
