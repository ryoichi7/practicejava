package ru.mirea.practice9.MergeSort;

import java.util.Random;
import java.util.*;

class Student {
    public int GPA;
    public String name;

    public Student(int GPA, String name) {
        this.GPA = GPA;
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class MergeSort {

    public static void mergeSort(List<Student> arr, int start, int end) {
        if (start != end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    private static void merge(List<Student> arr, int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int k = 0;

        Student[] temp = new Student[end - start + 1];

        while ((i <= mid) && (j <= end)) {
            if (arr.get(i).GPA < arr.get(j).GPA)
                temp[k++] = arr.get(i++);
            else
                temp[k++] = arr.get(j++);
        }

        while (i <= mid) {
            temp[k++] = arr.get(i++);
        }

        while (j <= end) {
            temp[k++] = arr.get(j++);
        }

        for (i = start; i <= end; i++) {
            arr.remove(i);
            Student e = temp[i - start];
            arr.add(i, e);
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();

        List<Student> arr1 = new ArrayList<Student>();
        List<Student> arr2 = new ArrayList<Student>();

        int n = rand.nextInt(5,10);

        for (int i = 0; i < n; i++) {
            int x = rand.nextInt(1, 100);
            arr1.add(new Student(x, "Bob" + x));
        }
        for (int i = 0; i < n; i++) {
            int x = rand.nextInt(101, 200);
            arr2.add(new Student(x, "Bob" + x));
        }
        List<Student> res = new ArrayList<Student>();

        for (int i = 0 ; i < n; i++){
            res.add(arr1.get(i));
            res.add(arr2.get(i));
        }

        System.out.println(Arrays.toString(res.toArray()));

        mergeSort(res, 0, res.size() - 1);

        System.out.println(Arrays.toString(res.toArray()));
    }

}