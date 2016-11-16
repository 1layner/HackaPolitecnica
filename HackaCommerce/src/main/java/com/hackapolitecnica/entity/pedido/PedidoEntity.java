package com.hackapolitecnica.entity.pedido;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.hackapolitecnica.config.BaseEntity;

@Entity
@Table(name="tbl_pedido")
@AttributeOverride(name="id", column=@Column(name="codPedido"))
public class PedidoEntity extends BaseEntity<Long> {

	private static final long serialVersionUID=1L;
	
	@Column(name="precoTotal", nullable=false)
	private float precoTotal;
	
	@Column(name="precoDesconto", nullable=false)
	private float precoDesconto;
	
	@Column(name="precoFrete", nullable=false)
	private float precoFrete;
	
	@Column(name="codUsuario", length=8, nullable=false)
	private int codUsuario;
	
	@Column(name="codTransp", length=8, nullable=false)
	private int codTransp;
	
	@Column(name="dtaPedido", nullable=false)
	private Date dtaPedido;
	
	@Column(name="dataHoraEntrega", nullable=false)
	private Calendar dataHoraEntrega;
	
	@Column(name="descricao", length=240, nullable=false)
	private String descricao;
	
	public PedidoEntity(){
		
	}
	
	public PedidoEntity(float precoTotal, float precoDesconto, float precoFrete, int codUsuario, int codTransp,
			Date dtaPedido, Calendar dataHoraEntrega, String descricao) {
		super();
		this.precoTotal = precoTotal;
		this.precoDesconto = precoDesconto;
		this.precoFrete = precoFrete;
		this.codUsuario = codUsuario;
		this.codTransp = codTransp;
		this.dtaPedido = dtaPedido;
		this.dataHoraEntrega = dataHoraEntrega;
		this.descricao = descricao;
	}



	public float getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(float precoTotal) {
		this.precoTotal = precoTotal;
	}

	public float getPrecoDesconto() {
		return precoDesconto;
	}

	public void setPrecoDesconto(float precoDesconto) {
		this.precoDesconto = precoDesconto;
	}

	public float getPrecoFrete() {
		return precoFrete;
	}

	public void setPrecoFrete(float precoFrete) {
		this.precoFrete = precoFrete;
	}

	public int getCodUsuario() {
		return codUsuario;
	}

	public void setCodUsuario(int codUsuario) {
		this.codUsuario = codUsuario;
	}

	public int getCodTransp() {
		return codTransp;
	}

	public void setCodTransp(int codTransp) {
		this.codTransp = codTransp;
	}

	public Date getDtaPedido() {
		return dtaPedido;
	}

	public void setDtaPedido(Date dtaPedido) {
		this.dtaPedido = dtaPedido;
	}

	public Calendar getDataHoraEntrega() {
		return dataHoraEntrega;
	}

	public void setDataHoraEntrega(Calendar dataHoraEntrega) {
		this.dataHoraEntrega = dataHoraEntrega;
	}
	
	public String getDescricao(){
		return descricao;
	}
	
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}
	
	
}
