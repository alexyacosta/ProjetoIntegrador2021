
public class Professor extends PessoaFisica {
	private String materia;
	private String turno;

	public Professor(String membro, String cpf, String sexo, String materia, String turno) {
		super(membro, cpf, sexo);
		this.materia = materia;
		this.turno = turno;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String toString() {
		return super.toString() + "\nMateria: " + this.materia + "\nturno: " + this.turno;
	}

}
