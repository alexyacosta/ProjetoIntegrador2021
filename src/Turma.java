
 public class Turma extends Curso {
	private String professor;
	private String aluno;
	
	public Turma (String disciplina, String periodo, String modulo, String professor, String aluno) {
		super (disciplina, periodo, modulo);
		this.professor = professor;
		this.aluno = aluno;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public String getAluno() {
		return aluno;
	}

	public void setAluno(String aluno) {
		this.aluno = aluno;
		
	}
	 
	public String toString() {
		return super.toString()+"\nProfessor: "+this.professor+"\nAluno: "+this.aluno;
	}

}
