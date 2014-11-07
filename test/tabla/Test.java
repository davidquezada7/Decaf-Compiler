import java.util.Hashtable;

public class Test{
	public static void main(String[] args){
		Hashtable<String, Object> tabla = new Hashtable<String, Object>();
		tabla.put("ddd", "nombre");
		Hashtable<String,Object> tabla2 = new Hashtable<String,Object>();
		tabla2.put("nombre","nombre");
		tabla.put("cosa", tabla2 );
		System.out.println(((Hashtable)tabla.get("cosa")).containsKey("nombre"));
		}
}