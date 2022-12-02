package com.leitordoc.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.leitordoc.models.Ocupacao;
import com.leitordoc.validators.OcupacaoValidator;

public class OcupacaoUtils {

	public static OcupacaoValidator mountOcupacao(String page1) {
		String natureza = getNatureza(page1);
		String ocupacaoPrincipal = getOcupacaoPrincipal(page1);
		String tipoDeclaracao = getTipoDeclaracao(page1);
		String nroReciboUltimaEntrega = getNroReciboUltimaEntrega(page1);
		Ocupacao o = new Ocupacao(natureza, ocupacaoPrincipal, tipoDeclaracao, nroReciboUltimaEntrega);
		OcupacaoValidator ov = new OcupacaoValidator(o);
		return ov;
	}
	
//	private String natureza;
	public static String getNatureza(String page1) {
		Pattern pattern = Pattern.compile("((Natureza\\sda\\sOcupa��o)|(NATUREZA\\sDA\\sOCUPA��O)):\\s[\\d\\w�-��-�,.\\-\\s]*\\s((Ocupa��o)|(OCUPA��O))");
		Matcher matcher = pattern.matcher(page1);
		String match3 = "";
		if (matcher.find())
		{
			String match = matcher.group();
		    String match2 = match.split("((Natureza\\sda\\sOcupa��o)|(NATUREZA\\sDA\\sOCUPA��O)):\\s")[1];
		    match3 = match2.split("\\s((Ocupa��o)|(OCUPA��O))")[0];
		}
		return match3;
	}
//	private String ocupacaoPrincipal;
	public static String getOcupacaoPrincipal(String page1) {
		Pattern pattern = Pattern.compile("((Ocupa��o\\sPrincipal)|(OCUPA��O\\sPRINCIPAL)):\\s[\\d\\w�-��-�,.\\-\\s]*\\s((Tipo\\sde\\sdeclara��o)|(TIPO\\sDE\\sDECLARA��O))");
		Matcher matcher = pattern.matcher(page1);
		String match3 = "";
		if (matcher.find())
		{
			String match = matcher.group();
		    String match2 = match.split("((Ocupa��o\\sPrincipal)|(OCUPA��O\\sPRINCIPAL)):\\s")[1];
		    match3 = match2.split("\\s((Tipo\\sde\\sdeclara��o)|(TIPO\\sDE\\sDECLARA��O))")[0];
		    match3 = match3.replace("\n", "");
		}
		return match3;
	}
//	private String tipoDeclaracao;
	public static String getTipoDeclaracao(String page1) {
		Pattern pattern = Pattern.compile("((Tipo\\sde\\sdeclara��o)|(TIPO\\sDE\\sDECLARA��O)):\\s[\\d\\w�-��-�,.\\-\\s]*\\sN�?");
		Matcher matcher = pattern.matcher(page1);
		String match3 = "";
		if (matcher.find())
		{
			String match = matcher.group();
		    String match2 = match.split("((Tipo\\sde\\sdeclara��o)|(TIPO\\sDE\\sDECLARA��O)):\\s")[1];
		    match3 = match2.split("\\sN�?")[0];
		}
		return match3;
	}
//	private String nroReciboUltimaEntrega;
	public static String getNroReciboUltimaEntrega(String page1) {
		Pattern pattern = Pattern.compile("((N�?)|(n�?))[\\d\\w�-��-�,.\\-\\s:]*\\s[\\d]{2}.?[\\d]{2}.?[\\d]{2}.?[\\d]{2}.?[\\d]{2}-?[\\d]{2}\\s");
		Matcher matcher = pattern.matcher(page1);
		String match3 = "";
		if (matcher.find())
		{
			String match = matcher.group();
		    String match2 = match.split("((N�?)|(n�?))[\\d\\w�-��-�,.\\-\\s]*:\\s*")[1];
		    match3 = match2.split("\\s")[0];
		}
		return match3;
	}
}
