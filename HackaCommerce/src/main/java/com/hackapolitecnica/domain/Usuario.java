package com.hackapolitecnica.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Usuario {
	@Id
	@GeneratedValue
	private Integer codUsuario;
	private String nomeCliente;
	private Integer contato1;
	private Integer contato2;
	private Integer cpf;
	private Integer cnpj;
	private Integer cep;
	private String tipoLogradouro;
	private String logradouro;
	private Integer numero;
	private String cidade;
	private String estado;
	private String email;
	private String senha;
	public Usuario(Integer codUsuario, String nomeCliente, Integer contato1, Integer contato2, Integer cpf,
			Integer cnpj, Integer cep, String tipoLogradouro, String logradouro, Integer numero, String cidade,
			String estado, String email, String senha) {
		super();
		this.codUsuario = codUsuario;
		this.nomeCliente = nomeCliente;
		this.contato1 = contato1;
		this.contato2 = contato2;
		this.cpf = cpf;
		this.cnpj = cnpj;
		this.cep = cep;
		this.tipoLogradouro = tipoLogradouro;
		this.logradouro = logradouro;
		this.numero = numero;
		this.cidade = cidade;
		this.estado = estado;
		this.email = email;
		this.senha = senha;
	}
	public Integer getCodUsuario() {
		return codUsuario;
	}
	public void setCodUsuario(Integer codUsuario) {
		this.codUsuario = codUsuario;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public Integer getContato1() {
		return contato1;
	}
	public void setContato1(Integer contato1) {
		this.contato1 = contato1;
	}
	public Integer getContato2() {
		return contato2;
	}
	public void setContato2(Integer contato2) {
		this.contato2 = contato2;
	}
	public Integer getCpf() {
		return cpf;
	}
	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}
	public Integer getCnpj() {
		return cnpj;
	}
	public void setCnpj(Integer cnpj) {
		this.cnpj = cnpj;
	}
	public Integer getCep() {
		return cep;
	}
	public void setCep(Integer cep) {
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
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
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
	
	

}
