import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int solve(String A)
    {

        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i =0; i<A.length(); i++)
        {
            if(!hm.containsKey(A.charAt(i)))
            {
                hm.put(A.charAt(i),1);
            }
            else
            {
                hm.put(A.charAt(i),(hm.get(A.charAt(i))+1));
            }

        }
        int diff_elems = hm.size();
        if(diff_elems==1)
            return 1;
        //check the occurences
        int n =0;
        for(Map.Entry<Character, Integer> entry: hm.entrySet())
        {
            if(entry.getValue()%2==1)
                n++;
        }
        if(n>1)
            return 0;

        return 1;

    }

    public static void main(String[] args)
    {
        String s = "inttnikjmjbemrberk";
        System.out.println(solve(s));
    }
}
