package teste.morphia;

import java.util.List;

import br.java.hromenique.carga.doc.AlunosEnvolvidosProjetoDoc;
import br.java.hromenique.transformacao.TransformadorProjeto;

public class TesteUtilitariosTransformadorProjetos {
	
	public static void main(String[]args){
		TransformadorProjeto transformador = new TransformadorProjeto();
		
		transformador.gerarFinanciadores("Conselho Nacional de Desenvolvimento Cient�fico e Tecnol�gico - Bolsa / The University of Michigan - Aux�lio financeiro / The University of Michigan - Bolsa / National Science Foundation - Aux�lio financeiro / American Museum of Natural History - Aux�lio financeiro / American Society of Ichthyologists and Herpetologists - Aux�lio financeiro");
		
	}

}
