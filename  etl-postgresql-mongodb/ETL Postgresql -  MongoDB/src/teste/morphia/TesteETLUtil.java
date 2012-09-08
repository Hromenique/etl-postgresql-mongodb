package teste.morphia;

import br.java.hromenique.utils.ETLUtil;

public class TesteETLUtil {
	
	public static void main(String[] args){
		String str = ETLUtil.deStringVaziaParaNull("  dfsad   ");
		
		System.out.println(str);
	}

}
