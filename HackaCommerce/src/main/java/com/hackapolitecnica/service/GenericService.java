package com.hackapolitecnica.service;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hackapolitecnica.config.BaseEntity;
import com.hackapolitecnica.config.ServiceMap;

public abstract class GenericService<T extends BaseEntity<ID>, ID extends Serializable> implements ServiceMap {

	private final Logger LOGGER = Logger.getLogger(this.getClass());
	
	@Autowired
	protected JpaRepository<T, ID> genericRepository;
	
	@RequestMapping(value="/todosProdutos", method = RequestMethod.GET)
	public List<T> listaTodos(){
		return this.genericRepository.findAll();
	}
	
	@RequestMapping(value="/salvar", method = RequestMethod.POST)
	public T salvar(@RequestBody T entityObject){
		entityObject.setId(null);
		return this.genericRepository.save(entityObject);
	}
	
	
	
	
	
}
