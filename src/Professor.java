
public class Professor {

	private String disciplinaProfessor;
	private String periodoProfessor;
	
	
	public Professor(String nome, String cpf, String sexo, String disciplina, String periodo, String disciplinaProfessor, String periodoProfessor) {
		super();
		this.disciplinaProfessor = disciplinaProfessor;
		this.periodoProfessor = periodoProfessor;
	}


	public String getDisciplinaProfessor() {
		return disciplinaProfessor;
	}


	public void setDisciplinaProfessor(String disciplinaProfessor) {
		this.disciplinaProfessor = disciplinaProfessor;
	}


	public String getPeriodoProfessor() {
		return periodoProfessor;
	}


	public void setPeriodoProfessor(String periodoProfessor) {
		this.periodoProfessor = periodoProfessor;
	}
	public String toString() {
		return super.toString()+"\nDisciplina: "+this.disciplinaProfessor+"\nPeriodo: "+this.periodoProfessor;
	}

}
