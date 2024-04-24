import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>(10);
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            int input = sc.nextInt();
            num.add(input);
        }
        for (int vitor : num){
            if (vitor % 2 == 0){
                numeros.add(vitor);
            }
        }

        if (numeros.isEmpty()){
            System.out.println("A pilha está vazia");
        }else {
            System.out.print("numeros pares: "+ numeros);
        }

    }
}