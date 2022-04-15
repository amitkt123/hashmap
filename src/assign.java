import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class assign {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        int arr[] = {1,2,2,3,3,4,4};
        int k =2;
        int j =1;
        for (int ele: arr) {
            if(!hm.containsKey(ele))
            {
                hm.put(ele,j);
            }
            else
            {
                hm.put(ele,(hm.get(ele))+1);
            }
        }
        System.out.println(hm);
        int sum =0;
       for(Map.Entry<Integer, Integer> entry : hm.entrySet())
        {
            if(entry.getValue()==k)
                sum = sum+ entry.getKey();
        }
        System.out.println(sum);
    }
}
