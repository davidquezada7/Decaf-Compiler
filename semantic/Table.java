package compiler.semantic;

import java.util.Hashtable;

public class Table{
	public Hashtable<String, String> variables;
	public Hashtable<String, Table> funciones;
	public Table padre;
	public String tipo = null;

	public Table(){
		this.variables = new Hashtable<String,String>();
		this.funciones = new Hashtable<String, Table> ();
		this.padre = null;

	}

	public Table(Table padre){
		this.variables = new Hashtable<String,String>();
		this.funciones = new Hashtable<String, Table> ();
		this.padre = padre;

	}

	public void addToVariables(String key, String value){
		this.variables.put(key,value);
	}

	public void addToFunciones(String key, Table padre){
		Table tab = new Table(padre);
		this.funciones.put(key, tab);
		// System.out.println(this.funciones.containsKey(key));
		// System.out.println("que onda");
	}

	public Table getTable(String key){
		if(this.funciones.containsKey(key)){ 
			//System.out.println("si contiene");
			return funciones.get(key);
		}else{
			//System.out.println("no contiene");
			return null;
		}
			
	}

	public Boolean containsKey(String key){
		if(variables.containsKey(key)||funciones.containsKey(key)){
			return true;
		}else{
			return false;
		}
		
	}
}