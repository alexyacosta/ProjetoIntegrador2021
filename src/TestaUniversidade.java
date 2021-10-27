

public class TestaUniversidade {

	public static void main(String[] args) {
		System.out.println("\n -------- UNIVERSIDADE --------");
		Universidade Universidade = new Universidade("Senac", "35.887709/0001-35", "100200", "Santo Amaro",
				"Avenida Maranhão S/N");
		System.out.println(Universidade);
		System.out.println("\n -------- PESSOA JURÍDICA -----");
		PessoaJuridica PessJuri = new PessoaJuridica("Nome da empresa", "CNPJ: Inscrição Estadual");
		System.out.println(PessJuri);
		System.out.println("\n -------- FORNECEDOR ----------");
		Fornecedor Fornecedor = new Fornecedor("Code Plast", "30.223344/0001-30", "Cadeiras");
		System.out.println(Fornecedor);
		System.out.println("\n ----------- CURSO ----------- ");
		Curso Curso = new Curso("Análise e Desenvolvimento de Sistema", "Indefinido", "EaD");
		System.out.println(Curso);
		System.out.println("\n ------------ TURMA -----------");
		Turma Turma = new Turma("PI", "Ind", "EaD", "Mestre dos Magos", "Vingador");
		System.out.println(Turma);
		System.out.println("\n ------- PESSOA FISICA --------");
		PessoaFisica PessFisica = new PessoaFisica("Professor/Aluno", "000.000.000-00", "F/M");
		System.out.println(PessFisica);
		System.out.println("\n ---------- Professor ----------");
		Professor Professor = new Professor("Mestre kame", "123.456.789-00", "M", "Tai chutsu", "Despertino", null, null);
		System.out.println(Professor);
	}

}
