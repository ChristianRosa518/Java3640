package Lab9;

public class Lab9 {
    public static void main(String[] args){
    System.out.println(factorial(30));
    System.out.println(fib(4));
    int array[] = {1,2,3,4,5};
    System.out.println(sumArray(array, array.length - 1));
    }

    static int factorial(int number){
        if (number >= 1){
        return number * factorial(number - 1);
        }
        else return 1;
    }

    public static int fib(int num) {
        if ((num == 0) || (num == 1))
            return num;
        else
            return fib(num - 1) + fib(num - 2);
    }

    public static int sumArray(int[] arr, int index){
        if(index == 0){
            return arr[index];
        }
            else
                return arr[index] + sumArray(arr, index-1);

    }
}
