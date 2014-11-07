import java.util.Hashtable;

public class Prueba{
	public static void main(String [] args){
	
			Tabla tabla = new Tabla();
			// tabla.addToVariables("a", "int");
			tabla.addToFunciones("volumen", tabla);
			tabla.getTabla("volumen");
			search(tabla.getTabla("volumen"));
	}

	public static void search(Tabla tabla){
		if(tabla.variables.containsKey("a")){
			System.out.println("la variable a es tipo: "+tabla.variables.get("a"));

		}else{
			

			//System.out.println(tabla.get("parent"));
			if (tabla.padre!= null) {
				search(tabla.padre);
			}else{
				//System.out.println("entro2");
				System.out.println("no existe la variable");
			}
		}
	}
}