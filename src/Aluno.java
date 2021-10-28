

public class Aluno extends PessoaFisica{
	/*
	 * membro 
	 * cpf
	 * sexo
	 */
	private String cursando;
	private String classe;
	private String semestre;
	private String cadeira;
	
	public Aluno(String membro, String sexo, String cpf, String cursando, String classe, String semestre, String cadeira) {
		super(membro, sexo, cpf);
		this.cursando = cursando;
		this.classe = classe;
		this.semestre = semestre;
		this.cadeira = cadeira;
	}

	public String getCursando() {
		return cursando;
	}

	public void setCursando(String cursando) {
		this.cursando = cursando;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	public String getCadeira() {
		return cadeira;
	}

	public void setCadeira(String cadeira) {
		this.cadeira = cadeira;
	}
	public String toString() {
    	return super.toString()+"\nCursando: "+this.cursando+"\nClasse: "+this.classe+"\nSemestre: "+this.semestre+"\nDisciplina: "+this.cadeira;
		
	}
}