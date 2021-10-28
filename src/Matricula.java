
public class Matricula extends Aluno{

	public Matricula(String membro, String sexo, String cpf, String cursando, String classe, String semestre,
			String cadeira) {
		super(membro, sexo, cpf, cursando, classe, semestre, cadeira);
		// 
	}
	private String rg;
	private String numeroTelefone;
	private String email;
	private String data;
	private String formaPagamento;
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getNumeroTelefone() {
		return numeroTelefone;
	}
	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	
}
