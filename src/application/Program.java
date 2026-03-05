package application;

public class Program {

	public static void main(String[] args) {
		

		System.out.println("Sistema  de sites de vendas");
		double valorTotalVenda = 5000.00;
		int quantidadeVendas = 200;
		
		
		double ticketMedio = valorTotalVenda / quantidadeVendas;
		
		System.out.println();
		System.out.println("Valor total de vendas: "+ String.format("%.2f",valorTotalVenda));
		System.out.println("Ticket medio: "+ String.format("%.2f",ticketMedio));
	}

}
