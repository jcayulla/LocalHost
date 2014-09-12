package com.cayulla.achuni.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class KeyboardBean implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1237012135195657600L;
	
	private String value;

	public String getValue() {
		System.out.println("KeyboardBean:: reading value: "+value);
		return value;
	}

	public void setValues(String value) {
		System.out.println("KeyboardBean:: setting value: "+value);
		this.value = value;
	}
	
	
}
