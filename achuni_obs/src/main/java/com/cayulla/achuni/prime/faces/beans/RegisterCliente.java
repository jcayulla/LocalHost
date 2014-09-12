package com.cayulla.achuni.prime.faces.beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.cayulla.achuni.hibernate.data.Cliente;
import com.cayulla.achuni.spring.service.ClienteService;

@ManagedBean
@SessionScoped
public class RegisterCliente {
	 @ManagedProperty("#{ClienteService}")
	    private ClienteService ClienteService;
	 
	    private Cliente Cliente = new Cliente();
	 
	    public ClienteService getClienteService() {
	        return ClienteService;
	    }
	 
	    public void setClienteService(ClienteService ClienteService) {
	        this.ClienteService = ClienteService;
	    }
	 
	    public Cliente getCliente() {
	        return Cliente;
	    }
	 
	    public void setCliente(Cliente Cliente) {
	        this.Cliente = Cliente;
	    }
	 
	    public String register() {
	        // Calling Business Service
	        ClienteService.register(Cliente);
	        // Add message
	        FacesContext.getCurrentInstance().addMessage(null, 
	                new FacesMessage("The Cliente "+this.Cliente.getNombres()+" Is Registered Successfully"));
	        return "";
	    }
}
