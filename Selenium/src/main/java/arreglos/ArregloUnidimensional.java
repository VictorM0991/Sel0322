package arreglos;

public class ArregloUnidimensional {

	public static void main(String[] args) {
int intArray[];
int []intArray2;
long longArray[];


//declara un array de strings
String[] arr;


//asignado memoria para 5 posiciones/valores
arr= new String[5];


//inicializa el primer elemento del array
arr[0] = "cero";

//inicializa el segundo elemento del array
arr[1]= "uno";

//Sucesivamente
arr[2]= "dos";
arr[3]= "tres";
arr[4]= "cuatro";

for (int i=0; i<arr.length; i++) { //arr.lenght calcula la longitud del arreglo
	System.out.println("Elemento en el indice " + i + ":" + arr[i]);
	
}

System.out.println();  

String[] sArray= new String[] {"cero","uno"};
for (int i=0; i<sArray.length; i++) {
	System.out.println("Elemento en el indice:" + i + ":" + sArray[i]);
}
	}

}
