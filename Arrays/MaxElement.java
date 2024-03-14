//This code will print the maximum element of an array
import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i=0;i< arr.length;i++){
            System.out.println("Enter the value of arr["+i+"] : ");
            arr[i]= sc.nextInt();
        }

        int max = Integer.MIN_VALUE;

        for (int elements: arr) {
            if(elements>max){
                max = elements;
            }
        }

        System.out.println("Maximum Element is : "+max);
    }
}
