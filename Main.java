package MainPackage;

import Test.CountTest;

import java.util.Random;

public class Main {




    public static void main(String[] arg){

        int[] arr = new int[4];
        Random rd = new Random();

        for(int i = 0; i < arr.length; ++i) {
            arr[i] = rd.nextInt(101);
        }
        System.out.println("The array before sorting:");
        view(arr);
        System.out.println();
        CountTest countTest=new CountTest();
        countTest.Merge_Sort(arr,arr.length);

        System.out.print("\n\nThe array after sorting:");
        System.out.println();
        view(arr);
        System.out.println();

    }


    public static void view(int[] mas){

        for(int x : mas)
        {
            System.out.print(x + " ");
        }


    }

}

