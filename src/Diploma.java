
public class Diploma 
{
	//private boolean conseguito;    Non serve, è implicito il fatto che ci sia un diploma con l'esistenza stessa dell'oggetto
	private String tipoDiploma;
	private String durataDiploma;
	private String votoDiploma;
	
	public Diploma(String tipoDiploma, String durataDiploma, String votoDiploma)
	{
		this.tipoDiploma = tipoDiploma;
		this.durataDiploma = durataDiploma;
		this.votoDiploma = votoDiploma;
	}
	
	
	@Override
	public String toString()
	{
		return "          Tipo di diploma: " + tipoDiploma + "\n          Durate del diploma: " + durataDiploma + 
				"\n          Voto di uscita: " + votoDiploma + "\n//";
	}
}
