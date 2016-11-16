package com.hackapolitecnica.config;

public final class ServicePath {

	public static final String ALL = "/**";
	
	public static final String PUBLIC_ROOT_PATH = "/public";
	
	public static final String PRIVATE_ROOT_PATH = "/private";
	
	public static final String ROOT_PATH = "/comidasparavoce";
	
	public static final String PRODUTO_ROOT_PATH = PUBLIC_ROOT_PATH + ROOT_PATH + "/produto";
	
	public static final String PEDIDO_ROOT_PATH = PRIVATE_ROOT_PATH + ROOT_PATH + "/pedido";
	
	public static final String TRANSPORTADORA_ROOT_PATH = PRIVATE_ROOT_PATH + ROOT_PATH + "/transp";
	
	public static final String USUARIO_ROOT_PATH = PRIVATE_ROOT_PATH + ROOT_PATH + "/usuario";
	
}
