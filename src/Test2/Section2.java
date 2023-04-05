package Test2;

import java.util.ArrayList;
import java.util.Arrays;

public class Section2 {
    public static void main(String[] args){
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(4);
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(4);
        removeSelect(nums, 2);

        int[] numbers = {10,-20,30,40, 35};
        reverseNumArray(numbers);
        System.out.println("");
        secondBigNumArray(numbers);

        Circle greg = new Circle();
        Rectangle eric = new Rectangle();

        greg.scale(2.3);
        greg.scale(2.5);
        eric.scale(2.5);
        eric.scale(2.7);

    }

    public static void reverseNumArray(int[] n){
        for (int i = n.length-1; i >= 0; i--) {
            System.out.print(n[i] + " ");
        }
    }


    public static void secondBigNumArray(int[] n){
//        System.out.println(n.length);
        Arrays.sort(n);
        System.out.println(n[n.length - 2]);
    }

    public static void removeSelect(ArrayList<Integer> n, int y){
        for(int i = 0; i < n.size() ; i++){
            n.remove(Integer.valueOf(y));
        }
//        for (int i = 0; i < n.size(); i++){
//            System.out.println(n.get(i));
//        }
    }
}
