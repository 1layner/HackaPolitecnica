package com.hackapolitecnica.entity.usuario;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.hackapolitecnica.config.BaseEntity;

@Entity
@Table(name="tbl_usuario")
@AttributeOverride(name="id", column=@Column(name="codUsuario"))
public class UsuarioEntity extends BaseEntity<Long> {

	private static final long serialVersionUID=1L;
	
	@Column(name="nomeCliente", length=45, nullable=false)
	private String nomeCliente;
	
	@Column(name="contato1", length=9, nullable=false)
	private int contato1;
	
	@Column(name="contato2", length=9, nullable=false)
	private int contato2;
	
	@Column(name="cgc", length=14, nullable=false, unique=true)
	private int cgc;
	
	@Column(name="cep", length=8, nullable=false)
	private int cep;
	
	@Column(name="tipoLogradouro", length=15, nullable=false)
	private String tipoLogradouro;
	
	@Column(name="logradouro", length=45, nullable=false)
	private String logradouro;
	
	@Column(name="numero", length=15, nullable=false)
	private int numero;
	
	@Column(name="cidade", length=45, nullable=false)
	private String cidade;
	
	@Column(name="email", length=45, nullable=false, unique=true)
	private String email;
	
	@Column(name="senha", length=8, nullable=false, unique=true)
	private String senha;
	
	@Column(name="logadouro alternativo", length=45, nullable=false)
	private String logradouroAlternativo;
	
	@Column(name="tipo logradouro alternativo", length=45, nullable=false)
	private String tipoLogradouroAlternativo;
	
	@Column(name="cep alternativo", length=45, nullable=false)
	private String cepAlternativo;
	
	public UsuarioEntity(){
		
	}

	public UsuarioEntity(String nomeCliente, int contato1, int contato2, int cgc, int cep, String tipoLogradouro,
			String logradouro, int numero, String cidade, String email, String senha, String logradouroAlternativo,
			String tipoLogradouroAlternativo, String cepAlternativo) {
		super();
		this.nomeCliente = nomeCliente;
		this.contato1 = contato1;
		this.contato2 = contato2;
		this.cgc = cgc;
		this.cep = cep;
		this.tipoLogradouro = tipoLogradouro;
		this.logradouro = logradouro;
		this.numero = numero;
		this.cidade = cidade;
		this.email = email;
		this.senha = senha;
		this.logradouroAlternativo = logradouroAlternativo;
		this.tipoLogradouroAlternativo = tipoLogradouroAlternativo;
		this.cepAlternativo = cepAlternativo;
	}



	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getContato1() {
		return contato1;
	}

	public void setContato1(int contato1) {
		this.contato1 = contato1;
	}

	public int getContato2() {
		return contato2;
	}

	public void setContato2(int contato2) {
		this.contato2 = contato2;
	}

	public int getCgc() {
		return cgc;
	}

	public void setCgc(int cgc) {
		this.cgc = cgc;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getTipoLogradouro() {
		return tipoLogradouro;
	}

	public void setTipoLogradouro(String tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getLogradouroAlternativo() {
		return logradouroAlternativo;
	}

	public void setLogradouroAlternativo(String logradouroAlternativo) {
		this.logradouroAlternativo = logradouroAlternativo;
	}

	public String getTipoLogradouroAlternativo() {
		return tipoLogradouroAlternativo;
	}

	public void setTipoLogradouroAlternativo(String tipoLogradouroAlternativo) {
		this.tipoLogradouroAlternativo = tipoLogradouroAlternativo;
	}

	public String getCepAlternativo() {
		return cepAlternativo;
	}

	public void setCepAlternativo(String cepAlternativo) {
		this.cepAlternativo = cepAlternativo;
	}
	
	
}
