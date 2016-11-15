CREATE DATABASE `hackapoli` /*!40100 DEFAULT CHARACTER SET utf8 */;

CREATE TABLE `tbl_pedido` (
  `codPedido` int(8) NOT NULL AUTO_INCREMENT,
  `precoTotal` float DEFAULT NULL,
  `precoDesconto` float DEFAULT NULL,
  `precoFrete` float DEFAULT NULL,
  `codUsuario` int(11) DEFAULT NULL,
  `codTransp` int(11) DEFAULT NULL,
  `dtaPedido` timestamp NULL DEFAULT NULL,
  `dataHoraEntrega` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`codPedido`),
  KEY `codUsuario` (`codUsuario`),
  KEY `codTransp` (`codTransp`),
  CONSTRAINT `tbl_pedido_ibfk_1` FOREIGN KEY (`codUsuario`) REFERENCES `tbl_usuario` (`codUsuario`),
  CONSTRAINT `tbl_pedido_ibfk_2` FOREIGN KEY (`codTransp`) REFERENCES `tbl_transportadora` (`codTransp`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `tbl_produto` (
  `codProduto` int(8) NOT NULL,
  `nomeProduto` varchar(45) NOT NULL,
  `preco` float NOT NULL,
  `peso` float DEFAULT NULL,
  `tamanho` varchar(45) DEFAULT NULL,
  `estoque` int(11) DEFAULT NULL,
  `nomeImg` varchar(45) DEFAULT NULL,
  `path` varchar(45) DEFAULT NULL,
  `descricao` varchar(240) NOT NULL,
  `tags` varchar(100) DEFAULT NULL,
  `categoria` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`codProduto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `tbl_produto_pedido` (
  `codPedido` int(11) DEFAULT NULL,
  `codProduto` int(11) DEFAULT NULL,
  KEY `codPedido` (`codPedido`),
  KEY `codProduto` (`codProduto`),
  CONSTRAINT `tbl_produto_pedido_ibfk_1` FOREIGN KEY (`codPedido`) REFERENCES `tbl_pedido` (`codPedido`),
  CONSTRAINT `tbl_produto_pedido_ibfk_2` FOREIGN KEY (`codProduto`) REFERENCES `tbl_produto` (`codProduto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `tbl_transportadora` (
  `codTransp` int(8) NOT NULL AUTO_INCREMENT,
  `nomeTransp` varchar(45) DEFAULT NULL,
  `enderecoTransp` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`codTransp`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `tbl_usuario` (
  `codUsuario` int(8) NOT NULL AUTO_INCREMENT,
  `nomeCliente` varchar(45) NOT NULL,
  `contato1` int(9) DEFAULT NULL,
  `contato2` int(9) DEFAULT NULL,
  `cgc` int(14) NOT NULL,
  `cep` int(8) DEFAULT NULL,
  `tipoLogradouro` varchar(15) DEFAULT NULL,
  `logradouro` varchar(45) DEFAULT NULL,
  `numero` int(15) DEFAULT NULL,
  `cidade` varchar(45) DEFAULT NULL,
  `email` varchar(45) NOT NULL,
  `senha` int(8) NOT NULL,
  `logadouro alternativo` varchar(45) DEFAULT NULL,
  `tipo logadouro alternativo` varchar(45) DEFAULT NULL,
  `cep alternativo` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`codUsuario`),
  UNIQUE KEY `cnpj` (`cgc`),
  UNIQUE KEY `email` (`email`),
  UNIQUE KEY `senha` (`senha`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;





