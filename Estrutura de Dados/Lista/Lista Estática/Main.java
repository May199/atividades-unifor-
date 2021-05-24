import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(s.nextInt());
        }
        for(int l = 0; l < list.size(); l++) {
            for(int j = l+1; j < list.size(); j++){
                if(list.get(j) == list.get(l)){
                    list.remove(j);
                }
            }
        }
        System.out.println(list);
        
        s.close();
    }
}