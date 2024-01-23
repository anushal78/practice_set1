public class Practice_Set6 {
    public static void main(String[] args){
        //Q1 : Create an array of 5 floats and calculate their sum.
        float[] num = {35.2f,98.2f,25.5f,45.6f,55.8f};
        float m = 55.8f;
        float sum = 0;
 // using for loop
          boolean inArray = false;
//        for(int m=0;m<=num.length-1;m++)
//        {
//            sum= sum+num[m];
//        }
//        System.out.println(sum);
        //using for each loop
        for(float element : num) {
            sum+=element;
        }
        System.out.println(sum);

//Q2 : To find out whether a given integer is present in an array or not
        for (float element:num){
            if(element==m){
                inArray = true;
                break;
            }
        }
        if(inArray){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }

//Q3 : Calculate the average marks from an array containing marks of all students in physics using a for-each loop.
        float[] marks = {45.6f, 25.7f, 49.6f, 67.8f, 35.8f};
        float sum1 = 0;
        for(float element:marks){
            sum1+=element;
        }
        //System.out.println(sum1);
        float average = sum1 / (marks.length);
        System.out.println(average);

//Q4 : Create a Java program to add two matrices of size 2x3
        int[][] mat1 = {{2,3,4},
                        {5,6,7}};
        int[][] mat2 = {{2,3,4},
                        {5,6,7}};
        int[][] res =  {{0,0,0},
                        {0,0,0}};

        // for reading elements
        for(int i=0;i<mat1.length;i++) {//row no of times
            for(int j=0;j<mat1[i].length;j++){// column no of times
                //System.out.format("i=%d and j=%d\n", i,j);
                res[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        //to print elements in 2D array format
        for(int i=0;i<mat1.length;i++) {//row no of times
            for(int j=0;j<mat1[i].length;j++){// column no of times
                System.out.print(res[i][j] + " ");
                res[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println(" ");// prints a new line

//Q5 : Write a Java program to reverse an array
        int[] arr = {1,2,3,4,5};

        for(int i=arr.length-1;i>=0;i--) {
            System.out.println(arr[i]);
        }
//Q6 : Write a Java program to find the maximum element in an array
        int a[] = {23, 45, 78, 50, 88, 99};
        int max = a[0];
        for(int i=0;i<a.length;i++) {
            if(max<a[i]) {
                max = a[i];
            }
        }
        System.out.println(max);

        //Q7 : Write a Java program to find the minimum element in an array
        int b[] = {23, 45, 78, 50, 88, 99};
        int min = b[0];
        for(int i=0;i<b.length;i++){
            if(min>b[i]){
                min = b[i];
            }
        }
        System.out.println(min);

//Q8 : Write a Java program to find whether an array is sorted or not
        //int[] c = {23, 45, 72, 68, 93}; //To check unsorted
        int[] c = {12,14,16,18,20};  // to check sorted one
        boolean isSorted = true;
        for(int k=0;k<c.length-1;k++) {
            if(c[k]>c[k+1]) {
                isSorted = false;
                break;
            }
        }
        if(isSorted) {
            System.out.println("It is sorted");
        }
        else {
            System.out.println("It is not sorted");
        }
    }
}
