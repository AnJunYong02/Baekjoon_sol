import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        HashMap<String, Float> map = new HashMap<>();
        map.put("A+", 4.3F);
        map.put("A0", 4.0F);
        map.put("A-", 3.7F);
        map.put("B+", 3.3F);
        map.put("B0", 3.0F);
        map.put("B-", 2.7F);
        map.put("C+", 2.3F);
        map.put("C0", 2.0F);
        map.put("C-", 1.7F);
        map.put("D+", 1.3F);
        map.put("D0", 1.0F);
        map.put("D-", 0.7F);
        map.put("F", 0.0F);

        for(Map.Entry<String, Float> entry : map.entrySet())
            if(input.equals(entry.getKey())) System.out.print(entry.getValue());
    }
}
