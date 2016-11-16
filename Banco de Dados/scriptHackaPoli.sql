-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema hackapoli
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema hackapoli
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `hackapoli` DEFAULT CHARACTER SET utf8 ;
USE `hackapoli` ;

-- -----------------------------------------------------
-- Table `hackapoli`.`tbl_usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hackapoli`.`tbl_usuario` (
  `codUsuario` INT(8) NOT NULL AUTO_INCREMENT,
  `nomeCliente` VARCHAR(45) NOT NULL,
  `contato1` INT(9) NULL DEFAULT NULL,
  `contato2` INT(9) NULL DEFAULT NULL,
  `cgc` INT(14) NOT NULL,
  `cep` INT(8) NULL DEFAULT NULL,
  `tipoLogradouro` VARCHAR(15) NULL DEFAULT NULL,
  `logradouro` VARCHAR(45) NULL DEFAULT NULL,
  `numero` INT(15) NULL DEFAULT NULL,
  `cidade` VARCHAR(45) NULL DEFAULT NULL,
  `email` VARCHAR(45) NOT NULL,
  `senha` INT(8) NOT NULL,
  `logadouro alternativo` VARCHAR(45) NULL,
  `tipo logadouro alternativo` VARCHAR(45) NULL,
  `cep alternativo` VARCHAR(45) NULL,
  PRIMARY KEY (`codUsuario`),
  UNIQUE INDEX `cnpj` (`cgc` ASC),
  UNIQUE INDEX `email` (`email` ASC),
  UNIQUE INDEX `senha` (`senha` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `hackapoli`.`tbl_transportadora`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hackapoli`.`tbl_transportadora` (
  `codTransp` INT(8) NOT NULL AUTO_INCREMENT,
  `nomeTransp` VARCHAR(45) NULL DEFAULT NULL,
  `enderecoTransp` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`codTransp`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `hackapoli`.`tbl_pedido`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hackapoli`.`tbl_pedido` (
  `codPedido` INT(8) NOT NULL AUTO_INCREMENT,
  `precoTotal` FLOAT NULL DEFAULT NULL,
  `precoDesconto` FLOAT NULL DEFAULT NULL,
  `precoFrete` FLOAT NULL DEFAULT NULL,
  `codUsuario` INT(8) NULL DEFAULT NULL,
  `codTransp` INT(8) NULL DEFAULT NULL,
  `dtaPedido` TIMESTAMP NULL,
  `dataHoraEntrega` TIMESTAMP NULL,
  `descricao` VARCHAR(240) NULL,
  PRIMARY KEY (`codPedido`),
  INDEX `codUsuario` (`codUsuario` ASC),
  INDEX `codTransp` (`codTransp` ASC),
  CONSTRAINT `tbl_pedido_ibfk_1`
    FOREIGN KEY (`codUsuario`)
    REFERENCES `hackapoli`.`tbl_usuario` (`codUsuario`),
  CONSTRAINT `tbl_pedido_ibfk_2`
    FOREIGN KEY (`codTransp`)
    REFERENCES `hackapoli`.`tbl_transportadora` (`codTransp`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `hackapoli`.`tbl_produto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hackapoli`.`tbl_produto` (
  `codProduto` INT(8) NOT NULL AUTO_INCREMENT,
  `nomeProduto` VARCHAR(45) NOT NULL,
  `preco` FLOAT NOT NULL,
  `peso` FLOAT NULL DEFAULT NULL,
  `tamanho` VARCHAR(45) NULL DEFAULT NULL,
  `estoque` INT(11) NULL DEFAULT NULL,
  `nomeImg` VARCHAR(45) NULL DEFAULT NULL,
  `path` VARCHAR(45) NULL DEFAULT NULL,
  `descricao` VARCHAR(240) NOT NULL,
  `tags` VARCHAR(100) NULL,
  `categoria` VARCHAR(45) NULL,
  PRIMARY KEY (`codProduto`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `hackapoli`.`tbl_produto_pedido`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hackapoli`.`tbl_produto_pedido` (
  `codPedido` INT(8) NOT NULL,
  `codProduto` INT(8) NOT NULL,
  `quantidade` INT NULL,
  INDEX `codPedido` (`codPedido` ASC),
  INDEX `codProduto` (`codProduto` ASC),
  PRIMARY KEY (`codPedido`, `codProduto`),
  CONSTRAINT `tbl_produto_pedido_ibfk_1`
    FOREIGN KEY (`codPedido`)
    REFERENCES `hackapoli`.`tbl_pedido` (`codPedido`),
  CONSTRAINT `tbl_produto_pedido_ibfk_2`
    FOREIGN KEY (`codProduto`)
    REFERENCES `hackapoli`.`tbl_produto` (`codProduto`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
