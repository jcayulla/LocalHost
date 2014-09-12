package com.cayulla.achuni.hibernate.data;

public class Cliente {

	private long clienteId;
	private String nombres;
	private String apellidos;
	private int tipo;
	private String numeroDocumento;
	private boolean estado;
	public long getClienteId() {
		return clienteId;
	}
	public void setClienteId(long clienteId) {
		this.clienteId = clienteId;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
	
/*	CREATE TABLE IF NOT EXISTS `kirito`.`CLIENTE` (
			  `ID_Cliente` INT(11) NOT NULL,
			  `Nombres` VARCHAR(45) NULL DEFAULT NULL,
			  `Apellidos` VARCHAR(45) NULL DEFAULT NULL,
			  `Tipo_Documento` VARCHAR(45) NOT NULL,
			  `Num_Documento` VARCHAR(45) NOT NULL,
			  `Estado` INT(11) NOT NULL,
			  PRIMARY KEY (`ID_Cliente`))
			ENGINE = InnoDB
			DEFAULT CHARACTER SET = utf8
			COLLATE = utf8_general_ci;*/
	
}
