//program generates a random array of a random size and bubble-sorts it.

//the program will ask user for the largest possible value held in array,
//then asks user for maximum possible size of array. It then displays the
//array before and after bubble-sorting it.

//for instance, if the user wants the largest value to be 1, the array will
//consist of 0s and 1s. If the user wants the maximum size for array to be
//20, the array size will be less than or equal to 20.

import java.util.Random;
import java.util.Scanner;

public class BubbleSort
{
    public static void bubbleSort(int arr[])
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            for(int j = 0; j < arr.length - 1; j++)
            {
                int temp;
                if(arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    public static void display(int arr[], int a)
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        if(a == 0)
        {
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        do
        {
            Random randomNumbers = new Random();
            System.out.println("Please enter the range for random number generation");
            Scanner inp = new Scanner(System.in);
            int range = inp.nextInt();
        
            System.out.println("Please enter the max possible size for array");
            int n = inp.nextInt();
            int arraysize = randomNumbers.nextInt(n);
            int[] arr = new int[arraysize];
        
            for(int i = 0; i < arraysize; i++)
            {
                arr[i] = randomNumbers.nextInt(range + 1);
            }
            
            display(arr, 0);
            bubbleSort(arr);
            display(arr, 0);
            
        }while(true);
    }
}