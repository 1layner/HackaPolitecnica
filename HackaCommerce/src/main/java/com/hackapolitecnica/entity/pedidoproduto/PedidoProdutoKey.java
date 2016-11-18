package com.hackapolitecnica.entity.pedidoproduto;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import com.hackapolitecnica.config.BaseKey;

@Embeddable
public class PedidoProdutoKey extends BaseKey {

	private static final long serialVersionUID=201602010251L;
	
	@Column(name="codPedido", length=11, nullable=false)
	private int codPedido;
	
	@Column(name="codProduto", length=11, nullable=false)
	private int codProduto;
	
	public PedidoProdutoKey(){
		
	}

	public PedidoProdutoKey(int codPedido, int codProduto) {
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
