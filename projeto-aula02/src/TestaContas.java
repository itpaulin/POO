import javax.swing.plaf.synth.SynthSpinnerUI;

public class TestaContas {
	public static void main(String[] args) {
		Conta conta1 = new Conta ();//xpto
		conta1.titular= ("Gabriel Rodrigues");
		conta1.numero= 1;
		if (conta1.deposita(-100)== false)
			System.out.println("Valor Insuficiente p/ deposito");
		conta1.mostraInformacoes();
		
		Conta conta2 = new Conta ();//xyz
		conta2.titular = "Rodrigo";
		conta2.numero = 25;
		if ( ! conta2.deposita(500))
			System.out.println("Valor inv�lido p/ dep�sito");
		if (conta2.saca(1001)== false)
			System.out.println("Saldo insuficiente. A conta s� possui "+conta2.saldo);
		
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
