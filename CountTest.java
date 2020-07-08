package Test;

import MainPackage.CountSort;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class CountTest {

    public CountSort countSort=new CountSort();


    @Test
    public void simpleTest() {
        int[] arr = {3, 1, 2};
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, countSort.sort(arr));
    }


    @Test
    public void reverseTest() {
        int[] arr = new int[100];
        int[] expected = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = 99 - i;
            expected[i] = i;
        }
        assertArrayEquals(expected, countSort.sort(arr));
    }




    public void Merge_Sort(int[] mas,int size)
    {
        if (size < 2) {
            return;
        }
        int mid = size / 2;
        int[] l = new int[mid];
        int[] r = new int[size- mid];

        for (int i = 0; i < mid; i++) {
            l[i] = mas[i];
        }
        for (int i = mid; i < size; i++) {
            r[i - mid] = mas[i];
        }
        Merge_Sort(l, mid);
        Merge_Sort(r, size - mid);

        merge(mas, l, r, mid, size - mid);


    }


    public  void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0; int zz=0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {

                a[k++] = l[i++];

            }
            else {

                a[k++] = r[j++];

            }
        }
        while (i < left) {

            a[k++] = l[i++];

        }
        while (j < right) {

            a[k++] = r[j++];

        }
    }

    @Test
    public void randomTest() {
        int[] arr = new int[100];
        int[] expected = new int[100];
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            arr[i] = rand.nextInt(1001);
            expected[i] = arr[i];
        }
        Merge_Sort(expected, expected.length);
        assertArrayEquals(expected, countSort.sort(arr));
    }


    private int[] generate(int N) {
        int[] arr = new int[N];
        Random rand = new Random();
        for (int i = 0; i < N; i++) {
            arr[i] = rand.nextInt(1000);
        }
        return arr;
    }

    private void check(int [] arr) {
        for (int i=0;i<arr.length-1;i++) {
            assertTrue(arr[i] <= arr[i+1]);
        }
    }


    @Test
    public void stressTestOne() {
        Merge_Sort(generate(1000), 1000);
    }


    @Test
    public void stressTestTwo() {
        Merge_Sort(generate(100000), 100000);
    }
    @Test
    public void stressTestThree() {
        Merge_Sort(generate(1000000), 1000000);
    }






}