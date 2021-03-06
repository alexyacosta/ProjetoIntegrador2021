
public class Universidade extends PessoaJuridica {
	
    private String regMec;
    private String sede;
    private String enderešo;
    
    public Universidade (String nome, String cnpj, String regMec, String sede, String enderešo) {
    	super(nome, cnpj);
    	this.regMec = regMec;
    	this.sede = sede;
    	this.enderešo = enderešo; 	
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

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}
    public String toString() {
    	return super.toString()+"\nRegistro MEC: "+this.regMec+"\nSede: "+this.sede+"\nEnderešo: "+this.enderešo;
    }
    
}

