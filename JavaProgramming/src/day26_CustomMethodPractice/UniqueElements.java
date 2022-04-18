package day26_CustomMethodPractice;

import utilities.ArraysUtility3;

import java.util.Arrays;

public class UniqueElements {
    //returns the unique elements of the array as a new array
    public static void main(String[] args) {
        int[]array={1,1,2,3,3,4,5,5,6,7,7,7};
        int[]unique=uniqueElements(array);
        System.out.println(Arrays.toString(unique));
        double[]array2={1.5,2.5,1.5,3.5,4.5,4.5,5.5,5.5};
        double[]unique2=uniqueElements(array2);
        System.out.println(Arrays.toString(unique2));
        char[]array3={'A','A','B','B','B','C'};
        char[]unique3=uniqueElements(array3);
        System.out.println(Arrays.toString(unique3));
    }
    public static int[]uniqueElements(int[]array){
        int[]result={};//new int[0]
        for (int each : array) {
        if (ArraysUtility3.frequencyOfElement(array,each)==1){//if the frequency is one,the element is unique
           result=ArraysUtility3.addElement(result,each);
        }
        }
        return result;
    }
    public static double[]uniqueElements(double[]array){
        double[]result={};//new int[0]
        for (double each : array) {
            if (ArraysUtility3.frequencyOfElement(array,each)==1){//if the frequency is one,the element is unique
                result=ArraysUtility3.addElement(result,each);
            }
        }
        return result;
    }
    public static char[]uniqueElements(char[]array){
        char[]result={};//new int[0]
        for (char each : array) {
            if (ArraysUtility3.frequencyOfElement(array,each)==1){//if the frequency is one,the element is unique
                result=ArraysUtility3.addElement(result,each);
            }
        }
        return result;
    }
    public static String[]uniqueElements(String[]array){
        String[]result={};//new int[0]
        for (String each : array) {
            if (ArraysUtility3.frequencyOfElement(array,each)==1){//if the frequency is one,the element is unique
                result=ArraysUtility3.addElement(result,each);
            }
        }
        return result;
    }
}
