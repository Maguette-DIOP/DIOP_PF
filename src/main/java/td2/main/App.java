package td2.main;
import td2.*;
import java.util.List;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Somme<Integer> sommeInt = (Integer x, Integer y)->{
            return x+y;
        };
        Somme<String> sommeStr = (String x, String y) -> {
            sb.append(x);
            sb.append(y);
            return sb.toString();
        };

        Somme<Double> sommeDbl = (Double x, Double y) -> {
            return x+y;
        };

        Somme <Long> sommeLong = (Long x, Long y) -> {
            return x+y;
        };

        ToString<Integer> intToString = (Integer x)-> ""+x;
        System.out.println(intToString.convertir(25));

        List<String> lst = List.of("A1","A2","A3");
        StringBuilder sa = new StringBuilder();
       /* ToString<String> listString = (List<String> ls) ->{
            for (e:listString) {
                sa.append(e);
            }
                return sa;
        };*/

        Predicate<Integer> tropPetit = (Integer taille)->{
            return taille<100;
        };

        Predicate<Integer> tropGrand = (Integer taille)->{
            return taille>100;
        };

        Predicate<Integer> tailleIncorrecte = tropGrand.or(tropPetit);

        Predicate<Integer> tailleCorrecte = tropGrand.and(tropPetit);

        Predicate<Double> poidsTropLourd = (Double poids)->{
            return poids>150.0;
        };

        Predicate<Double> poidsCorrecte = poidsTropLourd.negate();

        Predicate<Double> poidsAutorise = poidsCorrecte.or(poidsTropLourd);


    }
    public static <T> List<T> filtragePredicatif(List<Predicate<T>> p, List<T> t){

        return;
    }



}
