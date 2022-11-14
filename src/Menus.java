import java.util.Scanner;

public class Menus {
	
	Utils utils = new Utils();
	Scanner entrada = new Scanner(System.in);
	BubbleSort ordenarBubble = new BubbleSort();
	InsertionSort ordenarInsertion = new InsertionSort();
	MergeSort ordenarMerge = new MergeSort();
	QuickSort ordenarQuick = new QuickSort();
	SelectionSort ordenarSelection = new SelectionSort();
	int [] vetorOrdenado = new int[100];
	
	public void menuPrincipal() {
		
		System.out.println("Menu Principal");
		System.out.println("Opcao 1: Ordenar com BubbleSort");
		System.out.println("Opcao 2: Ordenar com InsertionSort");
		System.out.println("Opcao 3: Ordenar com MergeSort");
		System.out.println("Opcao 4: Ordenar com QuickSort");
		System.out.println("Opcao 5: Ordenar com SelectionSort");
		System.out.println("Opcao 6: Sair");
		System.out.print("Escolha uma opcão: ");
		int opcao = entrada.nextInt();
		
		switch(opcao) {
		case 1: 
			menuBubble();
		case 2:
			menuInsertion();
		case 3:
			menuMerge();
		case 4:
			menuQuick();
		case 5:
			menuSelection();
		case 6:
			System.exit(0);
		}
	}

	public void menuBubble() {
		
		int[] vetor = utils.generateNumbers(10, 100);
		
		System.out.println("Vetor não ordenado.");
		utils.printVetor(vetor);
		vetorOrdenado = ordenarBubble.ordenarVetor(vetor);
		System.out.println("\nVetor ordenado.");
		utils.printVetor(vetorOrdenado);
		
		voltar();
	}
	
	private void menuInsertion() {
		
		int[] vetor = utils.generateNumbers(10, 100);
		
		System.out.println("Vetor não ordenado.");
		utils.printVetor(vetor);
		vetorOrdenado = ordenarInsertion.ordenarVetor(vetor);
		System.out.println("\nVetor ordenado.");
		utils.printVetor(vetorOrdenado);
		
		voltar();
	}
	
	private void menuMerge() {
		
		int[] vetor = utils.generateNumbers(10, 100);
		
		System.out.println("Vetor não ordenado.");
		utils.printVetor(vetor);
		vetorOrdenado = ordenarMerge.ordenarVetor(vetor);
		System.out.println("\nVetor ordenado.");
		utils.printVetor(vetorOrdenado);
		
		voltar();
	}
	
	private void menuQuick() {
		
		int[] vetor = utils.generateNumbers(10, 100);
		
		System.out.println("Vetor não ordenado.");
		utils.printVetor(vetor);
		vetorOrdenado = ordenarQuick.ordenarVetor(vetor);
		System.out.println("\nVetor ordenado.");
		utils.printVetor(vetorOrdenado);
		
		voltar();
	}
	
	private void menuSelection() {
		
		int[] vetor = utils.generateNumbers(10, 100);
		
		System.out.println("Vetor não ordenado.");
		utils.printVetor(vetor);
		vetorOrdenado = ordenarSelection.ordenarVetor(vetor);
		System.out.println("\nVetor ordenado.");
		utils.printVetor(vetorOrdenado);
		
		voltar();
	}
	
	private void voltar() {
		System.out.print("\nDeseja voltar ao menu principal?");
		String resposta = entrada.next();
		if(resposta.equalsIgnoreCase("s"))
			menuPrincipal();
		else 
			System.out.println("Saindo...");
	}
}
