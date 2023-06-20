package Lab5;

import java.util.HashMap; // import the HashMap class
import java.util.HashSet;
import java.util.ArrayList;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Lab5 {
    public static void main(String[] args){
    int[] arr = {1,2,3,4,4,5,5,5};
        int[] arr2 = {1,2,3,4,5,93};
        int[] arr3 = {3,4,5,6,7,93};

    System.out.println(countDistinct(arr));
    System.out.println(hasDuplicates(arr));
    System.out.println(intersection(arr2, arr3));

    File myObj = new File("C:\\Users\\steal\\OneDrive\\College 2022\\CET 3640\\Class_1\\randotext.txt");
    System.out.println(new File("randotext.txt").getAbsolutePath());

    findAdjacentPairs(myObj);

    System.out.println(characterFrequency("Hello World"));

    }

    public static HashMap<Character, Integer> characterFrequency(String inputString) {
        HashMap<Character, Integer> lettahs = new HashMap<Character, Integer>();
        for (int i = 0; i < inputString.length(); i++){
            if(lettahs.get(inputString.charAt(i)) == null){
                lettahs.put(inputString.charAt(i), 1);
            }
            else{
                int value = lettahs.get(inputString.charAt(i));
                lettahs.put(inputString.charAt(i), value + 1);
            }
        }
        return lettahs;
    }


    public static void findAdjacentPairs(File input){
        // close enough
        HashMap<String, Integer> Nums = new HashMap<String, Integer>();
        try {
            Scanner sc = new Scanner(input);
            String previousWord = null;
            String nextWord = null;

            while (sc.hasNext()){
                if (previousWord == null){
                    previousWord = sc.next();
                }
                if (previousWord != null){
                    nextWord = sc.next();
                }
                if (previousWord != null && nextWord != null){
                    String pair = (previousWord + " " + nextWord).toLowerCase();
                    if(Nums.get(pair) == null){
                        Nums.put(pair, 1);
                        previousWord = nextWord;
                        nextWord = null;
                    }
                    else{
                        int value = Nums.get(pair);
                        Nums.put(pair, value + 1);
                        previousWord = nextWord;
                        nextWord = null;
                    }
                }
            }
            System.out.println(Nums.entrySet());
        }
        catch (FileNotFoundException ff) {
            System.out.println("Exception " + ff.toString());
        }
    }
    public static int countDistinct(int[] arr){
        HashMap<Integer, Integer> Nums = new HashMap<Integer, Integer>();
        for ( int i = 0; i < arr.length; i++){
            if(Nums.get(arr[i]) == null){
                Nums.put(arr[i], 1);
            }
            else{
                int value = Nums.get(arr[i]);
                Nums.put(arr[i], value + 1);
            }

        }
        return Nums.size();
    }

    public static boolean hasDuplicates(int[] arr){
        boolean status = false;
        HashMap<Integer, Integer> Nums = new HashMap<Integer, Integer>();
        for ( int i = 0; i < arr.length; i++){
            if(Nums.get(arr[i]) == null){
                Nums.put(arr[i], 1);
            }
            else{
                status = true;
            }

        }
        return status;
    }

    public static ArrayList<Integer> intersection(int[] arr, int[] arr2){
        HashMap<Integer, Integer> Nums = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> Nums2 = new HashMap<Integer, Integer>();
        ArrayList<Integer> newArr = new ArrayList<>();
        for ( int i = 0; i < arr.length; i++){
            if(Nums.get(arr[i]) == null){
                Nums.put(arr[i], 1);
            }
            else{
                int value = Nums.get(arr[i]);
                Nums.put(arr[i], value + 1);
            }
        }
        for ( int i = 0; i < arr2.length; i++){
            if(Nums2.get(arr2[i]) == null){
                Nums2.put(arr2[i], 1);
            }
            else{
                int value = Nums.get(arr[i]);
                Nums2.put(arr2[i], value + 1);
            }
        }
        for (int i : Nums.keySet()){
            for (int j: Nums2.keySet()){
                if( i == j){
                    newArr.add(i);
                }
            }
        }
        return newArr;
    }
}
