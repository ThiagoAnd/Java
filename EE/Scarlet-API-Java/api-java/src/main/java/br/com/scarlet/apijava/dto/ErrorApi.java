package br.com.scarlet.apijava.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorApi {
	
	private Error error;
	
	public ErrorApi(String codigoErro, String descricao) {
		this.error = Error.builder().codigoErroTemp(codigoErro).descricaoErroTemp(descricao).build();
	}

}

@Getter
@Setter
@Builder
class Error{
	
	private String codigoErroTemp;
	private String descricaoErroTemp;
	private String detalheErroTemp;
	
}
