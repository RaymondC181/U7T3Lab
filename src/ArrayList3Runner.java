import java.util.ArrayList;
import java.util.Arrays;
public class ArrayList3Runner {
    public static void main(String[] args)
    {
        Integer[] nums = {1, 2, 3, 4, 5, 6, 7};
        ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(nums));

        for(int i = 1; i<numList.size()-1;i++)
        {
           int current = numList.get(i);
           int next = numList.get(i+1);
           numList.set(i-1, current+next);
        }

        //[5, 7, 9, 11, 13, 6, 7]
        System.out.println(numList);

    }
}
