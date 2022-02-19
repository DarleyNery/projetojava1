package curso.java.alex;

import java.util.Date;

public class Pessoa {
	
	private String nome;
	
	private String sobreNome;
	
	private int idade;
	
	private Date dataNascimento;
	
	public Date getDataDeNascimento() {
		return dataNascimento;
	}
	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataNascimento = dataDeNascimento;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

}
