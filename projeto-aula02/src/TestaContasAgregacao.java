
public class TestaContasAgregacao {

	public static void main(String[] args) {
		Conta conta1 = new Conta ();//xpto
		conta1.getTitular().setNome("Gabriel Rodrigues");
		conta1.getTitular().setCpf("12345678911");
		conta1.setNumero(1);
		if (conta1.deposita(-100)== false)
			System.out.println("Valor Insuficiente p/ deposito");
		conta1.mostraInformacoes();
		
		Conta conta2 = new Conta ();//xyz
		conta2.getTitular().setNome("Rodrigo");
		conta2.getTitular().setCpf("12345678922");
		conta2.setNumero(25);
		if ( ! conta1.deposita(500))
			System.out.println("Valor inválido p/ depósito");
		if (conta1.saca(1001)== false)
			System.out.println("Saldo insuficiente. A conta só possui "+conta1.getSaldo());
		
		System.out.println();
		conta2.mostraInformacoes();
		
		System.out.println("Vou transferir 200 reais do Rodrigo p/ o Gabriel");
		conta2.transferePara(conta1, 200);
		System.out.println("Depois da transferencia....");
		conta1.mostraInformacoes();
		System.out.println();
		conta2.mostraInformacoes();

	}

}
