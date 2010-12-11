package br.com.soaexpert.resources;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
@Path("/documentos")
public class DocumentoController {

	private final Result result;
	
	public DocumentoController(Result result){
		this.result = result;
	}
	
	@Path("/documentos/{id}")
	@Get
	public void documento(){
		
	}
}
