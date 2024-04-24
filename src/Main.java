import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>(10);
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++){
            int input = sc.nextInt();
            num.add(input);
        }
        for (int i = num.size() -1;i >= 0; i--){
            num.get(i);
            if (i % 2 == 0){
                num.remove(i);
            }

        }
        System.out.print("numeros pares: "+ num);

        if (num.isEmpty()){
            System.out.println("A pilha está vazia");
        }

    }
}