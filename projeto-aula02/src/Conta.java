
public class Conta {
		private int numero;
		private Cliente titular = new Cliente();
		private double saldo = 500;
		//getters and setters
		
		public int getNumero() {
			return this.numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}

		public Cliente getTitular() {
			return this.titular;
		}

		public double getSaldo() {
			return this.saldo;
		}

		
		//comportamentos / métodos
		public boolean saca(double valor) {
			if(valor < this.saldo) {
				this.saldo = this.saldo - valor;
				return true;
			} else {
					return false;	
					}
		}
		
		public boolean deposita(double valor) {
			if (valor<= 0) {
				return false;
			} else {
				this.saldo +=valor;
				return true;
					}
		}
		
		
		//cpmta1;tramsfere(200,conta2)
		//conta1 é o this e conta2 é a contaDestino
		//conta1.transferePara (conta2, 200)
		public boolean transferePara (Conta contaDestino, double valor) {
			if (this.saca(valor)==true) {
				return contaDestino.deposita(valor);
				//return true;
			} return false;
			
		}
		
		public void mostraInformacoes () {
			System.out.println("Numero: "+this.numero);
			System.out.println("Saldo: "+this.saldo);
			System.out.println("Nome: "+this.getTitular().getNome());
			this.titular.mostraInformacoes(); 
		
		
		}
	
		
	
	
	
	
}

