package teste.morphia;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

import br.java.hromenique.carga.doc.CurriculoDoc;

public class TesteEncontrarId {
	
	public static void main(String[] args) throws SecurityException, NoSuchFieldException{
		
		Class<CurriculoDoc> classe = CurriculoDoc.class;
		classe.getFields();
		for(Method m : classe.getMethods()){
			Type type = m.getGenericReturnType();
			System.out.println(type.toString());
		}
	}

}
