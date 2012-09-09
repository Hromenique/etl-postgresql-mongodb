package teste.morphia;

public class TesteExpressaoRegular {
	
	public static void main(String[] args){
		
		String str = "Graduação ( 0) / Especialização ( 0) / Mestrado acadêmico ( 0) / Mestrado profissionalizante ( 0) / Doutorado ( 0)";
		str = str.replaceAll(" ", "");
		System.out.println(str);
	}

}
