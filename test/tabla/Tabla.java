import java.util.Hashtable;

public class Tabla{
	Hashtable<String, String> variables;
	Hashtable<String, Tabla> funciones;
	Tabla padre;

	public Tabla(){
		this.variables = new Hashtable<String,String>();
		this.funciones = new Hashtable<String, Tabla> ();
		this.padre = null;

	}

	public Tabla(Tabla padre){
		this.variables = new Hashtable<String,String>();
		this.funciones = new Hashtable<String, Tabla> ();
		this.padre = padre;

	}

	public void addToVariables(String key, String value){
		this.variables.put(key,value);
	}

	public void addToFunciones(String key, Tabla padre){
		Tabla tab = new Tabla(padre);
		this.funciones.put(key, tab);
		// System.out.println(this.funciones.containsKey(key));
		// System.out.println("que onda");
	}

	public Tabla getTabla(String key){
		if(this.funciones.containsKey(key)){ 
			System.out.println("si contiene");
			return funciones.get(key);
		}else{
			System.out.println("no contiene");
			return null;
		}
			
	}
}