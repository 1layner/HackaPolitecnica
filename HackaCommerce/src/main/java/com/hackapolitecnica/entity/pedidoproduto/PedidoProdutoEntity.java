package com.hackapolitecnica.entity.pedidoproduto;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.hackapolitecnica.config.BaseEntity;

@Entity
@Table(name="tbl_produto_pedido")
public class PedidoProdutoEntity extends BaseEntity<Long> {

	private static final long serialVersionUID=1L;
	
	@Column(name="codPedido", length=11, nullable=false)
	private int codPedido;
	
	@Column(name="codProduto", length=11, nullable=false)
	private int codProduto;
	
	public PedidoProdutoEntity(){
		
	}

	public PedidoProdutoEntity(int codPedido, int codProduto) {
		super();
		this.codPedido = codPedido;
		this.codProduto = codProduto;
	}

	public int getCodPedido() {
		return codPedido;
	}

	public void setCodPedido(int codPedido) {
		this.codPedido = codPedido;
	}

	public int getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}
}
