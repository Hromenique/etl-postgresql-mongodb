package teste.morphia;

import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import com.google.code.morphia.annotations.Property;

@Entity("estados")
public class Estado {

	@Id
	public int id;

	@Property("sigla")
	public String sigla;

	public String nome;

	public Estado() {

	}

	public Estado(String sigla, String nome) {
		this.sigla = sigla;
		this.nome = nome;
	}

	@Override
	public String toString() {
		StringBuilder to = new StringBuilder("Estado [Id: ").append(this.id)
				.append(" Nome:").append(this.nome).append(" Sigla:")
				.append(this.sigla).append("] ");
		return to.toString();
	}
}
