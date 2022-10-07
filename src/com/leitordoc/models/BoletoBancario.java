package com.leitordoc.models;

import java.util.Date;

public class BoletoBancario extends Documento {
	private String nomBeneficiario;
	private String docBeneficiario;
	private String codBeneficiario;
	
	public BoletoBancario(int id, String descricao, String filePath, String tipo, String nomBeneficiario,
			String docBeneficiario, String codBeneficiario, String codBanco, String nomPagador, String docPagador,
			String linhaDigitavel, Date emissao, Date vencimento, String valor, String nossoNumero,
			String localPagamento, String multa, String carteira, String mora) {
		super(id, descricao, filePath, tipo);
		this.nomBeneficiario = nomBeneficiario;
		this.docBeneficiario = docBeneficiario;
		this.codBeneficiario = codBeneficiario;
		this.codBanco = codBanco;
		this.nomPagador = nomPagador;
		this.docPagador = docPagador;
		this.linhaDigitavel = linhaDigitavel;
		this.emissao = emissao;
		this.vencimento = vencimento;
		this.valor = valor;
		this.nossoNumero = nossoNumero;
		this.localPagamento = localPagamento;
		this.multa = multa;
		this.carteira = carteira;
		this.mora = mora;
	}

	@Override
	public String toString() {
		return "BoletoBancario [nomBeneficiario=" + nomBeneficiario + ", docBeneficiario=" + docBeneficiario
				+ "\n, codBeneficiario=" + codBeneficiario + ", codBanco=" + codBanco + ", nomPagador=" + nomPagador
				+ ", docPagador=" + docPagador + ",\n linhaDigitavel=" + linhaDigitavel + ", emissao=" + emissao
				+ ", \n vencimento=" + vencimento + ", valor=" + valor + ", nossoNumero=" + nossoNumero
				+ ", \n localPagamento=" + localPagamento + ", multa=" + multa + ", carteira=" + carteira + ", mora="
				+ mora + "]";
	}

	public String getNomBeneficiario() {
		return nomBeneficiario;
	}

	public void setNomBeneficiario(String nomBeneficiario) {
		this.nomBeneficiario = nomBeneficiario;
	}

	public String getDocBeneficiario() {
		return docBeneficiario;
	}

	public void setDocBeneficiario(String docBeneficiario) {
		this.docBeneficiario = docBeneficiario;
	}

	public String getCodBeneficiario() {
		return codBeneficiario;
	}

	public void setCodBeneficiario(String codBeneficiario) {
		this.codBeneficiario = codBeneficiario;
	}

	public String getCodBanco() {
		return codBanco;
	}

	public void setCodBanco(String codBanco) {
		this.codBanco = codBanco;
	}

	public String getNomPagador() {
		return nomPagador;
	}

	public void setNomPagador(String nomPagador) {
		this.nomPagador = nomPagador;
	}

	public String getDocPagador() {
		return docPagador;
	}

	public void setDocPagador(String docPagador) {
		this.docPagador = docPagador;
	}

	public String getLinhaDigitavel() {
		return linhaDigitavel;
	}

	public void setLinhaDigitavel(String linhaDigitavel) {
		this.linhaDigitavel = linhaDigitavel;
	}

	public Date getEmissao() {
		return emissao;
	}

	public void setEmissao(Date emissao) {
		this.emissao = emissao;
	}

	public Date getVencimento() {
		return vencimento;
	}

	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getNossoNumero() {
		return nossoNumero;
	}

	public void setNossoNumero(String nossoNumero) {
		this.nossoNumero = nossoNumero;
	}

	public String getLocalPagamento() {
		return localPagamento;
	}

	public void setLocalPagamento(String localPagamento) {
		this.localPagamento = localPagamento;
	}

	public String getMulta() {
		return multa;
	}

	public void setMulta(String multa) {
		this.multa = multa;
	}

	public String getCarteira() {
		return carteira;
	}

	public void setCarteira(String carteira) {
		this.carteira = carteira;
	}

	public String getMora() {
		return mora;
	}

	public void setMora(String mora) {
		this.mora = mora;
	}

	private String codBanco;
	private String nomPagador;
	private String docPagador;
	private String linhaDigitavel;
	private Date emissao;
	private Date vencimento;
	private String valor;
	private String nossoNumero;
	private String localPagamento;
	private String multa;
	private String carteira;
	private String mora;
	
	public BoletoBancario(int id, String descricao, String filePath, String tipo) {
		super(id, descricao, filePath, tipo);
		// TODO Auto-generated constructor stub
	}
	
	//Atributos							tem fun��o para achar
//	private String nomBeneficiario;		  ok
//	private String docBeneficiario;       ok
//	private String codBeneficiario;		  ok
//	private String codBanco;			  ok
//	private String nomPagador;			  mais ou menos ok
//	private String docPagador;			  ok
//	private String linhaDigitavel;		  ok
//	private Data emissao;				  ok
//	private Date vencimento;			  ok
//	private double valor;				  ok
//	private String nossoNumero;			  ok
// 	private String localPagamento;	 	  ok
//	private String multa;				  ok
//	private String carteira;			  ok
//	private String mora;				  ok
//	private int usoDoBanco;
//	private double desconto;
//	private double juros;
//	private boolean aceite;
//	private String info;
//	private String especie;
//	private String moeda;
}
