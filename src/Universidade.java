
public class Universidade extends PessoaJuridica {
	
    private String regMec;
    private String sede;
    private String endere�o;
    
    public Universidade (String nome, String cnpj, String regMec, String sede, String endere�o) {
    	super(nome, cnpj);
    	this.regMec = regMec;
    	this.sede = sede;
    	this.endere�o = endere�o; 	
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

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
    public String toString() {
    	return super.toString()+"\nRegistro MEC: "+this.regMec+"\nSede: "+this.sede+"\nEndere�o: "+this.endere�o;
    }
    
}

