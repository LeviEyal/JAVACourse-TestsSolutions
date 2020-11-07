package src.T_2020_02_26;

/********************************************************
*  @author Eyal Levi
*  קורס מבוא לחישוב - אוניברסיטת אריאל 
*  https://github.com/LeviEyal
********************************************************/

public class q2_findMxSum {

    public static void main(String[] args) {
        System.out.println(findMaxNum("93&*ab1234crt70"));  // 1234
        System.out.println(findMaxNum("8ab(55c#r9"));       // 55
        System.out.println(findMaxNum("hello"));            // -1
    }

    private static int findMaxNum2(String s) {
        int max = -1, temp = -1;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            String num = "";
            while(c>='0' && c<='9' && i<s.length()-1){
                num += c;
                i++;
                c = s.charAt(i);
            }
            if(num.length() != 0)
                temp = Integer.parseInt(num);
            if(temp > max)
                max = temp;
            num = "";
        }
        return max;
    }
    private static int findMaxNum(String s) {
        String a[] = s.split("[^0-9]+");    //using regex
        int max = -1;
        for(int i=0; i<a.length; i++){
            int t = Integer.valueOf(a[i]);
            if(t > max)
                max = t;
        }
        return max;
    }

}