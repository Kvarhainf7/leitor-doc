package com.leitordoc.validators;

import java.util.Date;
import java.util.ArrayList;

import com.leitordoc.models.DescricaoValor;

public abstract class Validator {
	private Boolean valido = true;
	
	public Validator() {
		super();
	}
	public boolean isValido() {
		return valido;
	}
	public void setValido(Boolean valido) {
		this.valido = valido;
	}
	// Verdadeiro at� provado o contr�rio :p
	public void validate(String campo) {
		if (campo.length() == 0) {
			this.setValido(false);
		}
	}
	public void validate(ArrayList<DescricaoValor> campos) {
		for (DescricaoValor campo : campos) {
			if (campo.getValor().length() == 0 || campo.getDescricao().length() == 0) {
				this.setValido(false);
			}
		}
	}
	// Queria deixar s� validate tbm, mas dava erro e o override n�o resolvia
	public void validateStringArray(ArrayList<String> campos) {
		for (String campo : campos) {
			if (campo.length() == 0) {
				this.setValido(false);
			}
		}
	}
	
}
