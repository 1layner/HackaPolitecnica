create database hackapoli;

use hackapoli;

create table tbl_usuario(
	codUsuario int(8) auto_increment,
    nomeCliente varchar(45),
    contato1 int(9),
    contato2 int(9),
    cpf int(9) unique,
    cnpj int(14) unique,
    cep int(8),
    tipoLogradouro varchar(15),
    logradouro varchar(45),
    numero int(15),
    cidade varchar(45),
    estado varchar(45),
    email varchar(45) unique,
    senha int(8) unique,
	primary key(codUsuario)
);

create table tbl_transportadora(
	codTransp int(8) auto_increment,
    nomeTransp varchar(45),
    enderecoTransp varchar(45),
    primary key(codTransp)
);

create table tbl_produto(
	codProduto int(8) auto_increment,
    nomeProduto varchar(45),
    codBarra varchar(45),
    preco float,
    precoPromocional float,
    largura float, 
    altura float,
    comprimento float,
    estoque int,
    nomeImg varchar(45),
    path varchar(45),
    descricao varchar(240),
    codUsuario int,
    primary key(codProduto),
    foreign key(codUsuario) references tbl_usuario(codUsuario)
);

create table tbl_pedido(
	codPedido int(8) auto_increment,
    precoTotal float,
    precoDesconto float,
    precoFrete float,
    codUsuario int,
    codTransp int,
    primary key(codPedido),
    foreign key(codUsuario) references tbl_usuario(codUsuario),
    foreign key(codTransp) references tbl_transportadora(codTransp)
);

create table tbl_produto_pedido(
	codPedido int,
    codProduto int,
    foreign key(codPedido) references tbl_pedido(codPedido),
    foreign key(codProduto) references tbl_produto(codProduto)
);