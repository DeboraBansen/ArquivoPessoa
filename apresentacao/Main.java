package apresentacao;

import java.util.Scanner;

import dados.Pessoa;
import negocio.Sistema;


public class Main {
	private static Sistema sistema=new Sistema();
	private static Scanner s=new Scanner(System.in);
	
	public static void main(String[] args) {
		menu();

	}
	
	public static void imprimeMenu() {
		System.out.println("Escolha uma opcao: ");
		System.out.println("0- Sair");
		System.out.println("1- Cadastrar pessoa");
		System.out.println("2- Remover pessoa");
		System.out.println("3- Mostrar pessoas");
	}
	
	public static void menu() {
		int opcao =-1;
		while(opcao!=0) {
			
			imprimeMenu();
			opcao=s.nextInt();
			
			switch(opcao) {
			case 0:
				break;
			case 1:
				sistema.adicionarPessoa(novaPessoa());
				break;
			case 2:
				sistema.removerPessoa(escolherPessoa());
				break;
			case 3:
				mostrarPessoas();
				break;
			default:
				System.out.println("Numero invalido!");
				break;
				
			}
		}
	}
	
	private static Pessoa novaPessoa() {
		Pessoa p=new Pessoa();
		
		System.out.println("Digite o nome:");
		p.setNome(s.next());
		
		System.out.println("Digite a idade:");
		p.setIdade(s.nextInt());
		
		System.out.println("Digite a altura");
		p.setAltura(s.nextFloat());
		
		System.out.println("Digite a massa");
		p.setMassa(s.nextFloat());
		
		return p;
	}
	
	private static Pessoa escolherPessoa() {
		mostrarPessoas();
		
		System.out.println("Escolha uma pessoa: ");
		
		int escolha=s.nextInt();
		
		if(escolha<sistema.getList().size()) {
			return sistema.getList().get(escolha);
		}else {
			return null;
		}
		
	}
	
	private static void mostrarPessoas() {
		for(int i=0;i<sistema.getList().size();i++) {
			System.out.println("Pessoa "+i);
			System.out.println(sistema.getList().get(i));
			System.out.println();
		}
	}

}
