package com.hackapolitecnica.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Produto {
	@Id
	@GeneratedValue
	private Integer codProduto;
	private String nomeProduto;
	private String codBarra;
	private Float preco;
	private Float precoPromocional;
	private Float largura;
	private Float altura;
	private Float comprimento;
	private Integer estoque;
	private String path;
	private String descricao;
	@ManyToMany
	private Integer codUsuario;
	public Produto(Integer codProduto, String nomeProduto, String codBarra, Float preco, Float precoPromocional,
			Float largura, Float altura, Float comprimento, Integer estoque, String path, String descricao,
			Integer codUsuario) {
		super();
		this.codProduto = codProduto;
		this.nomeProduto = nomeProduto;
		this.codBarra = codBarra;
		this.preco = preco;
		this.precoPromocional = precoPromocional;
		this.largura = largura;
		this.altura = altura;
		this.comprimento = comprimento;
		this.estoque = estoque;
		this.path = path;
		this.descricao = descricao;
		this.codUsuario = codUsuario;
	}
	public Integer getCodProduto() {
		return codProduto;
	}
	public void setCodProduto(Integer codProduto) {
		this.codProduto = codProduto;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getCodBarra() {
		return codBarra;
	}
	public void setCodBarra(String codBarra) {
		this.codBarra = codBarra;
	}
	public Float getPreco() {
		return preco;
	}
	public void setPreco(Float preco) {
		this.preco = preco;
	}
	public Float getPrecoPromocional() {
		return precoPromocional;
	}
	public void setPrecoPromocional(Float precoPromocional) {
		this.precoPromocional = precoPromocional;
	}
	public Float getLargura() {
		return largura;
	}
	public void setLargura(Float largura) {
		this.largura = largura;
	}
	public Float getAltura() {
		return altura;
	}
	public void setAltura(Float altura) {
		this.altura = altura;
	}
	public Float getComprimento() {
		return comprimento;
	}
	public void setComprimento(Float comprimento) {
		this.comprimento = comprimento;
	}
	public Integer getEstoque() {
		return estoque;
	}
	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getCodUsuario() {
		return codUsuario;
	}
	public void setCodUsuario(Integer codUsuario) {
		this.codUsuario = codUsuario;
	}
	
}
