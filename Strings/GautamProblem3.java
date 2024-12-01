package com.basicStringQuestions;

public class GautamProblem3 {



    static int finding4ndLargest(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int seconLargest = Integer.MIN_VALUE;
        int thirdLARGEST = Integer.MIN_VALUE;
        int fourthLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){

                fourthLargest=thirdLARGEST;
                thirdLARGEST =seconLargest;
                seconLargest=largest;
                largest=arr[i];
            } else if (arr[i] > seconLargest &&  arr[i]!=largest) {
                fourthLargest=thirdLARGEST;
                thirdLARGEST=seconLargest;
                seconLargest = arr[i];
            }
            else if(arr[i] > thirdLARGEST ){
                fourthLargest=thirdLARGEST;
                thirdLARGEST = arr[i];
            }
            else if(arr[i] > fourthLargest){
                fourthLargest= arr[i];
            }
        }
        return fourthLargest;
    }


    public static void main(String[] args) {

        int arr[] = {1,13,56,78,13,55,99};

        // range 2 ^ -32 to 2 ^ 31;
        // int = 4 bytes 32 bites

        int a = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        System.out.println(a);
        System.out.println(max);
        System.out.println(finding4ndLargest(arr));


    }
}
