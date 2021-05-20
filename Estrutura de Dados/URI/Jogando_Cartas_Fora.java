import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Jogando_Cartas_Fora {
    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        String line, remove;
        int n, base, num;

        while(!(line = b.readLine()).equals("0")){
            n = Integer.parseInt(line);

            if(n == 1){
                System.out.println("Discarded cards: ");
                System.out.println("Remaining card: 1 ");
            }else{
                List<Integer> cards = new ArrayList<>();

                for(int i = 1; i <= n; i++){
                    cards.add(i);
                }
                base = 2;
                remove = "";

                while(cards.size() > 1){
                    for(Iterator<Integer> i = cards.iterator(); i.hasNext();){
                        num = i.next();

                        if(base == 2){
                            base = 0;
                            remove += num + ", ";
                            i.remove();
                        }base++;
                    }
                }
                System.out.println("Discarded cards: " + remove.substring(0, remove.length() - 2));
                System.out.println("Remaining card: " + cards.get(0));
            }
        }
    }
}