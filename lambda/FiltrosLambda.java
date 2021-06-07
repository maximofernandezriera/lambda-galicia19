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
 @Override
    public List<String> filtrar() {

	List<String> sList = new ArrayList<String>();
        
        return sList.stream().filter(o -> o.size()).collect(Collectors.toList());
    }
}
