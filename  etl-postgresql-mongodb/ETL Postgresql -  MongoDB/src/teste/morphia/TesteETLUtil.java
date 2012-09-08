package teste.morphia;

import br.java.hromenique.utils.ETLUtil;

public class TesteETLUtil {
	
	public static void main(String[] args){
		String str = ETLUtil.deStringVaziaParaNull("  dfsad   ");
		
		System.out.println(str);
		System.out.println("------------------");
		
		String resultado = ETLUtil.seIgualTrocar("' ;'", "'ajsdlkjdfkl'", null);
		System.out.println(resultado);
		
		System.out.println("------------------");//"', '            "
		
		String testeTrim = "kfdaj                ladjdk ";
		System.out.println(testeTrim.trim());
	}

}
