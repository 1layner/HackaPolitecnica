package com.hackapolitecnica.entity.transportadora;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.hackapolitecnica.config.BaseEntity;

@Entity
@Table(name="tbl_transportadora")
@AttributeOverride(name="id", column=@Column(name="codTransp"))
public class TransportadoraEntity extends BaseEntity<Long> {

	private static final long serialVersionUID=1L;
	
	@Column(name="nomeTransp", length=45, nullable=false)
	private String nomeTransp;
	
	@Column(name="enderecoTransp", length=45, nullable=false)
	private String enderecoTransp;
	
	public TransportadoraEntity(){
		
	}

	public TransportadoraEntity(String nomeTransp, String enderecoTransp) {
		super();
		this.nomeTransp = nomeTransp;
		this.enderecoTransp = enderecoTransp;
	}

	public String getNomeTransp() {
		return nomeTransp;
	}

	public void setNomeTransp(String nomeTransp) {
		this.nomeTransp = nomeTransp;
	}

	public String getEnderecoTransp() {
		return enderecoTransp;
	}

	public void setEnderecoTransp(String enderecoTransp) {
		this.enderecoTransp = enderecoTransp;
	}
}
