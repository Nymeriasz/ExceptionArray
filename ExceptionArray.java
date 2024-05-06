package ExExeption2;
import java.util.ArrayList;

public class ExceptionArray {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        try {
            lista.add("Name1");
            lista.add("Name2");
            lista.add("Name3");

            for (int i=0; i<5; i++){
                System.out.println(lista.get(i));
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Executado");
        }
    }
}
