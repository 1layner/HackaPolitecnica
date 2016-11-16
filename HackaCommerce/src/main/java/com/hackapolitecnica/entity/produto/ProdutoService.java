package com.hackapolitecnica.entity.produto;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackapolitecnica.config.ServicePath;
import com.hackapolitecnica.service.GenericService;

@RestController
@RequestMapping(path=ServicePath.PRODUTO_ROOT_PATH)
public class ProdutoService extends GenericService<ProdutoEntity, Long> {

}
