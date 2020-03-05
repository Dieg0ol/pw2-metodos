
public class ExemploscomRetorno {
	public static String concatenar(String nome, String sobrenome) {
		return (nome + " " + sobrenome);
	}
	public static int TamanhoNomeCompleto(String nome, String sobrenome) {
		String nomecompleto = concatenar(nome, sobrenome);
		return nomecompleto.length();
		
	}	
	public static void main(String[] args) {
	String nome = concatenar ("Diego", "Alves");
	int tamanho = TamanhoNomeCompleto ("Diego", "Alves");
	System.out.println("nome: "+ nome);
	System.out.println("Qtde: " + tamanho + " caracteres");
	}
}