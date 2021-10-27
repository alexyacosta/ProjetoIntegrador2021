public class PessoaFisica {
	private String professorAluno;
	private String cpf;
	private String sexo;
	
	public PessoaFisica(String professorAluno, String cpf, String sexo) {
		this.professorAluno = professorAluno;
		this.cpf = cpf;
		this.sexo = sexo;
	}
	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getProfessorAluno() {
		return professorAluno;
	}
	public void setProfessorAluno(String professorAluno) {
		this.professorAluno = professorAluno;
	}
	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	 public String toString() {
	    	return "professorAluno: "+this.professorAluno+"\nCPF: "+this.cpf+"\nSexo: "+this.sexo;
}
}