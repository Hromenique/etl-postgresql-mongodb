package teste.morphia;

public class TesteExpressaoRegular {
	
	public static void main(String[] args){
		
		String str = "Gradua��o ( 0) / Especializa��o ( 0) / Mestrado acad�mico ( 0) / Mestrado profissionalizante ( 0) / Doutorado ( 0)";
		str = str.replaceAll(" ", "");
		System.out.println(str);
	}

}
