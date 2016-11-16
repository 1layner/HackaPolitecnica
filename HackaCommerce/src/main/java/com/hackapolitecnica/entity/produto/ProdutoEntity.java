package com.hackapolitecnica.entity.produto;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.hackapolitecnica.config.BaseEntity;

@Entity
@Table(name="tbl_produto")
@AttributeOverride(name="id", column=@Column(name="codProduto"))
public class ProdutoEntity extends BaseEntity<Long> {

	private static final long serialVersionUID=1L;
	
	@Column(name="nomeProduto", length=45, nullable=false)
	private String nomeProduto;
	
	@Column(name="preco", nullable=false)
	private float preco;
	
	@Column(name="peso", nullable=false)
	private float peso;
	
	@Column(name="tamanho", length=45, nullable=false)
	private String tamanho;
	
	@Column(name="estoque", length=11, nullable=false)
	private int estoque;
	
	@Column(name="nomeImg", length=45, nullable=false)
	private String nomeImg;
	
	@Column(name="path", length=45, nullable=false)
	private String path;
	
	@Column(name="descricao", length=240, nullable=false)
	private String descricao;
	
	@Column(name="tags", length=100, nullable=false)
	private String tags;
	
	@Column(name="categoria", length=45, nullable=false)
	private String categoria;
	
	public ProdutoEntity(){
		
	}

	public ProdutoEntity(String nomeProduto, float preco, float peso, String tamanho, int estoque, String nomeImg,
			String path, String descricao, String tags, String categoria) {
		super();
		this.nomeProduto = nomeProduto;
		this.preco = preco;
		this.peso = peso;
		this.tamanho = tamanho;
		this.estoque = estoque;
		this.nomeImg = nomeImg;
		this.path = path;
		this.descricao = descricao;
		this.tags = tags;
		this.categoria = categoria;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public String getNomeImg() {
		return nomeImg;
	}

	public void setNomeImg(String nomeImg) {
		this.nomeImg = nomeImg;
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

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
}
