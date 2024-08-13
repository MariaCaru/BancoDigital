public class Main {

	public static void main(String[] args) {
		Cliente maria = new Cliente();
		maria.setNome("Maria");
		
		Conta cc = new ContaCorrente(maria);
		Conta poupanca = new ContaPoupanca(maria);

		cc.depositar(230);
		cc.transferir(150, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}