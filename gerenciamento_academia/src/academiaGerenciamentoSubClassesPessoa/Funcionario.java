package academiaGerenciamentoSubClassesPessoa;

public class Funcionario {
	private String cargo;

	public Funcionario(String cargo) {
		super();
		this.cargo = cargo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	// Método
	public String toString() {
		return String.format("""
				Cargo: %s
				""", cargo);
	}
	
}
