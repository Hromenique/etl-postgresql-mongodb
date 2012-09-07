package teste.morphia;

import java.util.ArrayList;
import java.util.List;

public class TesteSplit {
	
	public static void main(String[] args){
		String str = "ARRETCHE, M. ; AVRITZER, L. ; DELGADO, G. ; RODRIGUES, M. M. A. ; REIS, E. ; REIS, F. W. ; MENDONCA, R. S. P.";
		String[] strings = str.split(" ; ");
		List<String> listaStr = new ArrayList<String>();
		
		for(String aux : strings){
			System.out.println(aux);
		}
		
		for(int i = 0; i < strings.length; i++){
			listaStr.add(i, strings[i]);
		}
		
		System.out.println("---------------------------");
		
		for(String aux : listaStr){
			System.out.println(aux);
		}
		
		
		
		
	}

}
