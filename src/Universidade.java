
public class Universidade extends PessoaJuridica {
	
    private String regMec;
    private String sede;
    private String endereço;
    
    public Universidade (String nome, String cnpj, String regMec, String sede, String endereço) {
    	super(nome, cnpj);
    	this.regMec = regMec;
    	this.sede = sede;
    	this.endereço = endereço; 	
    }
	public String getRegMec() {
		return regMec;
	}

	public void setRegMec(String regMec) {
		this.regMec = regMec;
	}

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
    public String toString() {
    	return super.toString()+"\nRegistro MEC: "+this.regMec+"\nSede: "+this.sede+"\nEndereço: "+this.endereço;
    }
    
}

