import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            int qtd = sc.nextInt();
            double recorde = 0;
            double velocidade = 0;
            List<Integer> list = new ArrayList<Integer>();

            for (int i = 0; i < qtd; i++) {
                double tempo = sc.nextInt();
                double espaco = sc.nextInt();
                velocidade = espaco / tempo;

                if (i == 0) {
                    recorde = velocidade;
                    list.add(i + 1);
                } else if (velocidade > recorde) {
                    recorde = velocidade;
                    list.add(i + 1);
                }
            }

            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }

        }
        sc.close();
    }
}
