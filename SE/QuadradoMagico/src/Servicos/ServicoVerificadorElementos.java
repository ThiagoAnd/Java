package Servicos;

import Exceptions.VerificacaoException;

public interface ServicoVerificadorElementos {

	int verificar(int somaDesejada,int ordem,int [][] matriz ) throws VerificacaoException;
}
