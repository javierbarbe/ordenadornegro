package loopingsTema4;

public class Ej13berrorescorregido {
	//que lo resuelva el profe, no entiendo 
		public static void main(String[] args) {
			int i, j=0; // hay que definir j
			//
			for ( i =0; i< 10; i++) { //entra ya que i lo iguala a 0 al entrar en el for)
			
			if (i<j) {  // i no es menor que j, esigual, va al else
				System.out.println("aqui empieza i " +i);
			}else {
				System.out.println(j); // imprime 0 que es el valor de j
			}
		while (j<10) {//comprueba si j es menor que 10, como es el caso, entra en el while
				j++; //realiza el incremento y despues imprime, vuelve a chequear si j<10
			System.out.println("esta es j+1 "+j); // cuando j =10 va al do
				}
			do {
				//imprime j, que valia 10
				System.out.println("esta es el valor maximo de j  "+j);
				j++;
			}while(j<10);//imprime incrementa y luego comprueba para 
				//salir del bucle .vuelve arriba a i<j, entra en el if,imprime aqui empieza i=> sale,
			// pasa del while porque su condicion no se cumple (j ahora vale 11), entra en do, imprime 
				//este es el valor maximo de j
			//y sale volviendo a if i<j; repite hasta llegar a i<10
			}
			}
			}
		


