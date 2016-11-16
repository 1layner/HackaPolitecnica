package com.hackapolitecnica.entity.pedidoproduto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tbl_pedido_produto")
public class PedidoProdutoEntity {

	private static final long serialVersionUID=201602010251L;
	
	@Column(name="quantidade", nullable=false)
	private int quantidade;
	
	public PedidoProdutoEntity(){
		
	}

	public PedidoProdutoEntity(int quantidade) {
		super();
		this.quantidade = quantidade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
