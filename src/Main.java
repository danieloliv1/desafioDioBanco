
public class Main {

	public static void main(String[] args) {
		
		Cliente daniel = new Cliente();
		daniel.setNome("Daniel");

		Conta cc = new ContaCorrente(daniel);
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca(daniel);
		cc.transferir(70, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
