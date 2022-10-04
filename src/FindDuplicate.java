import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicate {
    public static void main(String[] args) {
        //Finding the duplicate
        int [] arr = {12,12,11,2,3,3,20,33,23,11,33,37};
        List<Integer> duplicate=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>1){
                duplicate.add(arr[i]);
            }

        }
        for(int i : duplicate){
            System.out.println(i);
        }


    }
}
