package com.hackapolitecnica.entity.pedido;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackapolitecnica.config.ServicePath;
import com.hackapolitecnica.service.GenericService;

@RestController
@RequestMapping(path=ServicePath.PEDIDO_ROOT_PATH)
public class PedidoService extends GenericService<PedidoEntity, Long> {

}
