package br.java.hromenique.utils;

public class ETLUtil {
	
	public static String deStringVaziaParaNull(String str){
		
		if(str == null){
			return null;
		}
		
		if(str.trim().equals("")){
			return null;
		}
		
		return str;		
	}

}
