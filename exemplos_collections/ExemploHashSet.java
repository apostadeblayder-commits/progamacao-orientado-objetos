
import java.util.HashSet;

public class ExemploHashSet {
    
    public static void main(String[] args) {
         HashSet<String> inteiros = new HashSet();
    
         inteiros.add("1");
         inteiros.add("2");
         inteiros.add("3");
         inteiros.add("3");
    
    
    for( String i : inteiros) {

        System.out.println(i);
    }
    
    if (inteiros.contains(3)) {
        System.out.println("3 esta no conjunto");
    }
    
     inteiros.remove("3");

     if ( inteiros.contains("3")) {
        System.out.println("3 nao esta no conjunto");
     }


     }
}
