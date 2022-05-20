
public class Cliente {
		private String nome;
		private String cpf;
		private String email;
		//getters setters
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		public void mostraInformacoes() {
			System.out.println("Nome: "+this.getNome());
			System.out.println("Cpf: "+this.getCpf());
			System.out.println("Email: "+this.getEmail());
		}
		
}
