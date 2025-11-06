import java.util.ArrayList;

public class ExemploArrayList {
    
public static void main(String[] args) {
   ArrayList<String> ListaNomes = new ArrayList<>();
    
   ListaNomes.add("Alice");
   ListaNomes.add("Bob");
   ListaNomes.add("Carol");

   for(String nome: ListaNomes){
       System.out.println(nome);
   } 


    System.out.println(ListaNomes.get(1));


    if(ListaNomes.contains("Bob")){
System.out.println("bob esta na lista");
    }
    else{
    System.out.println("bob nao esta na lista");
    }


    ListaNomes.remove("bob");

    if(ListaNomes.contains("Bob")){
        System.out.println("bob esta na lista");
            }
            else{
            System.out.println("bob nao esta na lista");
            }

            
if(ListaNomes.isEmpty()){
    System.out.println("a lista esta vazia");
}

ListaNomes.clear();

if(ListaNomes.isEmpty()){
    System.out.println("a lista esta vazia");
}
    






   }
}
