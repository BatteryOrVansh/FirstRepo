public class Arrays {
    public static void main(String[] args) {


        //Introduction to Arrays
        // ==============================================

        //  Declaration
        int [] marks;
        marks = new int [5];
        marks [0]= 5;
        System.out.println(marks[0]);
        System.out.println(marks[2]);

        // easiest method to print all the elements of arrays
        for(int elements : marks){
            System.out.println(elements);
        }

        // Declaration and memory allocation
        int [] quantity = new int [1];
        quantity[0] = 1;
        System.out.println(quantity[0]);

        // Declaration and memory allocation and initialization together
        int [] list = {1,2,44,5};
        System.out.println(list[2]);

        // =======================================================================


        // 2-D arrays
        System.out.println("2-D Arrays");
        int [] [] flats = new int [2][3];
        flats[0][0]= 100;
        flats[0][1]= 101;
        flats[0][2]= 102;
        flats[1][0]= 210;
        flats[1][1]= 211;
        flats[1][2]= 212;

        for (int i=0; i<flats.length; i++){
            for (int j=0; j<flats[i].length; j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");

            }
            System.out.print("\n");

        }




    // PRACTICE PROBLEMS

        // sum of numbers in an array
        System.out.println("SUM OF NUMBERS IN AN ARRAY");
        int [] nums = {1,2,3,4,5};
        int sum=0;
        for (int elements: nums){
            sum=sum+elements;

        }
        System.out.println("the sum is "+ sum);
        System.out.println("==========================================");

        // to check if a number is present in the array or not
        System.out.println("CHECK IF A NUMBER IS PRESENT IN AN ARRAY");
        int [] array = {1,2,3,4,5};
        int n = 21; //not present
      //int n = 2;  // present
        boolean isInarray = false;
        for (int element: array){
            if (n==element){
                isInarray= true;
            }
        }
        if(isInarray){
            System.out.println("the number is present in the array");
        }
        else{
            System.out.println("the number is not present in the array");
        }
        System.out.println("==================================================");












    }
}
