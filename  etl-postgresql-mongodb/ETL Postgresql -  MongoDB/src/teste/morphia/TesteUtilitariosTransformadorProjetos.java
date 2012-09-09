package teste.morphia;

import java.util.List;

import br.java.hromenique.carga.doc.AlunosEnvolvidosProjetoDoc;
import br.java.hromenique.transformacao.TransformadorProjeto;

public class TesteUtilitariosTransformadorProjetos {
	
	public static void main(String[]args){
		TransformadorProjeto transformador = new TransformadorProjeto();
		
		transformador.gerarFinanciadores("Conselho Nacional de Desenvolvimento Científico e Tecnológico - Bolsa / The University of Michigan - Auxílio financeiro / The University of Michigan - Bolsa / National Science Foundation - Auxílio financeiro / American Museum of Natural History - Auxílio financeiro / American Society of Ichthyologists and Herpetologists - Auxílio financeiro");
		
	}

}
