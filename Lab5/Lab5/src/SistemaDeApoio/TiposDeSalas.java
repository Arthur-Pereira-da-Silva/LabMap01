package src.SistemaDeApoio;

public enum TiposDeSalas {
	
	DIRETORIA, SECRETARIA, ADMINISTRACAO, LABORATORIO, BIBLIOTECA, BANHEIRO, SALADEESTUDOS, CA, AULA;
	
	public String getTipo() {
		switch(this) {
			case DIRETORIA:
				return "Diretoria";
			case SECRETARIA:
				return "Secretaria";
			case ADMINISTRACAO:
				return "Administração";
			case LABORATORIO:
				return "Laboratório";
			case BIBLIOTECA:
				return "Biblioteca";
			case BANHEIRO:
				return "Banheiro";
			case SALADEESTUDOS:
				return "Sala de estudos";
			case CA:
				return "CA";
			case AULA:
				return "Aula";
			default:
				return "Inexistente";
		}
	}

}
