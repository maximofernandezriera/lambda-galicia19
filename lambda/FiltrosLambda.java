import java.util.function.Predicate;

class FiltrosLambda {
 public static void main(String[] args) {
 String[] listaPalabras = {"cola", "limbo", "zapatos", "imposible"};
 System.out.print("Imprimir palabras con más de 5 caracteres: ");
 Predicate<String>predicado = s->s.length() > 5;
 filtrar(listaPalabras, predicado);
 System.out.print("\nImprimir palabras menores que vaca: ");
 filtrar(listaPalabras, s->s.compareTo("vaca") < 0);
 }
 //Método filtrar()
 public  String[] filtrar(String[] lp, Predicate pred) {
	return lp.stream().filter(pred).forEach(System.out::println);
 }
}
