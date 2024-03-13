/**
 * Clase de cifrado mono-alfabético.
 * @author Adrián Aguilera Moreno.
 */

public class cifrado01 {
    private long cifrado;                                // Clave cifrada.
    private final int semilla = 79;                      // Semilla para encriptar.
    private final String diccionario = "abefimnoprsuv";  // Posibles letras de la clave.
    
    
    /**
     * Constructor por parámetros.
     * @param clave Clave a cifrar.
     */
    public cifrado01(String clave){
        cifrado = recursion(semilla*13 + diccionario.indexOf(clave.charAt(0)), clave.substring(1));
    }
    
    /*
     * Método auxiliar al constructor.
     * Realiza recursión sobre los valores de la cadena "clave" en el constructor
     * y encripta mediante potencias de 13.
     */
    private long recursion(long acc, String resto) {
	if(resto.length() == 1) return acc*13 + diccionario.indexOf(resto.charAt(0));
	return recursion(13*acc + diccionario.indexOf(resto.charAt(0)), resto.substring(1));
    }
    
    /**
     * Método de acceso.
     * @return long - cifrado. Devuelve la palabra "clave" cifrada.
     */
    public long obtenerCifrado() { return cifrado; }
}
