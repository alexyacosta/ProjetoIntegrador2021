

public class Curso {
	private String disciplina;
	private String periodo;
	private String modulo;
	
	public Curso (String disciplina, String periodo, String modulo) {
		this.disciplina = disciplina;
		this.periodo = periodo;
		this.modulo = modulo;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getModulo() {
		return modulo;
	}

	public void setModulo(String modulo) {
		this.modulo = modulo;
	}
	public String toString() {
		return "\nDisciplina: "+this.disciplina+"\nPeriodo: "+this.periodo+"\nModulo: "+this.modulo;
	}
	

}