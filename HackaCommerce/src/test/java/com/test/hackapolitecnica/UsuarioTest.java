package com.test.hackapolitecnica;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hackapolitecnica.entity.usuario.UsuarioEntity;
import com.hackapolitecnica.entity.usuario.UsuarioRepository;
import com.test.hackapolitecnica.utils.AppContextTest;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=AppContextTest.class)
public class UsuarioTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(UsuarioTest.class);
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Test
	public void listaTodos(){
		List<UsuarioEntity> usuario = this.usuarioRepository.findAll();
		
		LOGGER.info(usuario + "");
	}
	
}
