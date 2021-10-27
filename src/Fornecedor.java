
public class Fornecedor extends PessoaJuridica {
	private String tipoDeFornecimento;
	
	public Fornecedor (String nome, String cnpj, String tipoDeFornecimento) {
		super(nome, cnpj);
		this.tipoDeFornecimento = tipoDeFornecimento;
	}

	public String getTipoDeFornecimento() {
		return tipoDeFornecimento;
	}

	public void setTipoDeFornecimento(String tipoDeFornecimento) {
		this.tipoDeFornecimento = tipoDeFornecimento;
	}
	public String toString() {
		return super.toString()+"\nTipo de Fornecimento: "+this.tipoDeFornecimento;
	}

}
