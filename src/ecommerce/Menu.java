package ecommerce;
import java.util.*;
import ecommerce.util.Cores;
import ecommerce.model.*;
import java.io.IOException;
public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int opcao;
		
		InstrumentoTeclas p1 = new InstrumentoTeclas("Piano", 1, "Giannine", 32000.00f, 1, "preto", 0,15);
		InstrumentoString i1 = new InstrumentoString("Violão", 2, "Giannine", 1000.00f, 1, "azul", 20,6 ,1);
		i1.visualizar();
		p1.visualizar();
		p1.sell(1);
		p1.visualizar();
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
				*           3 - Atualizar Produto                                       *
				*           4 - Apagar Produto                                          *
				*           5 - Buscar Produtos por ID                                  *
				*           6 - Vender produto                                          *
				*           7 - Adicionar ao estoque                                    *
				*           8 - Sair                                                    *
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
			
			
			if (opcao == 8) {
				System.out.println(Cores.TEXT_WHITE_BOLD+ "\nBanco do Brazil com Z - O Futuro começa aqui!");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch(opcao) {
			case 1:
				
				
				KeyPress();
				break;
			case 2: 
				
				KeyPress();
				break;
			case 3: 
				
				
				KeyPress();
				break;
			case 4:
				
				KeyPress();
				break;
			case 5:
				
				KeyPress();
				break;
			case 6:
				
				KeyPress();
				break;
			case 7:
				
				KeyPress();
				break;
			default: 
				System.out.println(Cores.TEXT_WHITE_BOLD+"\nOpção Inválida !\n");
				
				KeyPress();
				break;
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
