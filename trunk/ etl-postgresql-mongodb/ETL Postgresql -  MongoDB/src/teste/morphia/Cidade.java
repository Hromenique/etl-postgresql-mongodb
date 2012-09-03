package teste.morphia;

import java.util.List;

import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.Embedded;
import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import com.google.code.morphia.annotations.Reference;

@Entity("cidades")
public class Cidade {

	@Id
	public int id;

	public String nome;
	public Integer populacao;

	@Reference()
	public Estado estado;	
	public Integer estados;

	public Cidade() {
	}

	public Cidade(String nome, Estado estado) {
		super();
		this.nome = nome;
		this.estado = estado;

	}

	@Override
	public String toString() {
		StringBuilder to = new StringBuilder("Cidade [Id: ").append(this.id)
				.append(" Nome:").append(this.nome).append(" Estado:")
				.append(this.estado).append(" Bairros:").append("] ");
		return to.toString();
	}

}
