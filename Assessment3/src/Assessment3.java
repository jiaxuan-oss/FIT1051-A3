import java.util.ArrayList;
import java.util.Arrays;

/*
 * Assessment 3
 *
 * Copyright (c) 2022  Monash University
 *
 * Written by  Teh Jia Xuan 32844700
 *
 *
 */
public class Assessment3 {

    public static void main(String[] args){

        Assessment3 a3 = new Assessment3();
//        int no =10;
//        boolean flag = true;
//        double rate = 1.5;
//        String unit = "1051";
//        System.out.println(no+flag+unit+rate);
        // Instruction: To run your respective task, uncomment below individually
//        a3.task1a();
//        a3.task2();
//        a3.task3();
//       a3.gradeScale("80");
//        a3.daysOfTheWeek("2");
//        a3.task6();
//        a3.task7(5);
          a3.testing();
    }


    private void task1a(){
        // code your task 1a (calling method) here
        double arr [] = {1.0,2.0,3.0,4.0,5.0};

        Assessment3 a3 = new Assessment3();

        System.out.println("Before incrementing:");
        System.out.println("Value: " + arr[2]);
        System.out.println("List: " + Arrays.toString(arr));

        a3.task1b(arr , arr[2]);

        System.out.println("\nAfter incrementing: ");
        System.out.println("Value: " + arr[2]);
        System.out.println("List: " + Arrays.toString(arr));

        //Before incrementing:
        //Value: 3.0
        //List: [1.0, 2.0, 3.0, 4.0, 5.0]
        //
        //After incrementing:
        //Value: 3.0
        //List: [1.0, 3.0, 3.0, 4.0, 5.0]

        //we took 2nd and 3rd number from the array to be our example
        //we assigned array to method task1b first parameter(array)
        //and assigned 3rd number of array to method task1b second parameter(value)

        //we increment 2nd number in the array by using lst[1] from method task1b
        //and second parameter(value) is increment as well
        //array and 3rd number of the array are printed out after increment

        //Based on the result, 2nd number from the array has side effect
        // while 3rd number remain the same

        //this is due to side effects can occur to reference types as it is stored as address in stack
        //and the value will store in heap
        //Hence, when we assigned reference type (ie. array) to method parameter, it will point to the same address
        //Thus, values can be modified

        //as for the first parameter a reference type (array) is assigned to it.
        //Thus, they have the same address
        //Hence, there is a side effect when a value from that array is modified in a method
        //as they have the same address which means they stored their data in the same heap

        //On the other hand, value types will not have side effects because
        //when a value type variable is assigned to method parameter
        //a copy is passed to the method parameter
        //Hence, whatever changes made to that copy it will stay in that copy
        //it won't affect the original value
        //Hence value type would not have side effects

    }

    private void task1b(double lst[], double value){
        // code your task1b (called method) here
        lst[1] ++;
        value ++;

    }

    private void task2(){
        // code your task 2 here
        //initiating values
        int line1,line2,line3,line4;
        line1 = 1;
        line2 = 10;
        line3 = 100;
        line4 = 1000;

        //use string.format to make it justified
        String rightJustify = String.format("%10d\n%10d\n%10d\n%10d",line1,line2,line3,line4);

        //output
        System.out.println(rightJustify);
    }

    private void task3(){
        // code your task 3 here
        ArrayList <String> myList = new ArrayList<>(10);

        //add values
        myList.add("one");
        myList.add("seven");
        myList.add("five");
        myList.add("three");
        myList.add("eight");
        myList.add("ten");

        //add between five and three
        myList.add(3,"eleven");

        //print mylist
        System.out.println("My list =" + myList);

        //remove second to last element
        int sizeOfList = myList.size(); //check size of element

        myList.remove(sizeOfList-2); //remove second last elem

        //check is it removed
//        System.out.println(myList);

        //check seven in list
        String checkValue = "seven";
        boolean check = myList.contains(checkValue);
        System.out.println("My list contain \"seven\": " +check);
    }

    // code your task 4 here. You should create your own method shell.
    private String gradeScale(String mark){
        String grade = "";

        //cast from string to int
        int markPercentage = Integer.parseInt(mark);

        //evaluating result
        if (markPercentage >= 80 && markPercentage <= 100) {
            grade = "High Distinction";
        }
        else if (markPercentage >= 70 && markPercentage <= 79) {
            grade = "Distinction";
        } else if (markPercentage >= 60 && markPercentage <= 69) {
            grade = "Credit";
        } else if (markPercentage >= 50 && markPercentage <= 59) {
            grade = "Pass";
        } else if (markPercentage >= 0 && markPercentage <= 49) {
            grade = "Fail";
        }

        else{
            grade = "Mark is invalid please try again";
        }
        //output and return
        System.out.println("Mark : " + markPercentage + "\n" + "Grade: " + grade);
        return grade;

    }

    // code your task 5 here. You should create your own method shell.
    private String daysOfTheWeek(String day){

        //declare and casting
        String particularDays = "";
        int dayChosen = Integer.parseInt(day);

        //evaluating
        switch(dayChosen){
            case 1:
                particularDays = "Monday";
                break;

            case 2:
                particularDays = "Tuesday";
                break;

            case 3:
                particularDays = "Wednesday";
                break;

            case 4:
                particularDays = "Thursday";
                break;

            case 5:
                particularDays = "Friday";
                break;

            case 6:
                particularDays = "Saturday";
                break;

            case 7:
                particularDays = "Sunday";
                break;

            default:
                particularDays = "Error please enter value between 1 to 7";
                break;
        }

        //print output and return
        System.out.println("Day of the week: " + particularDays);
        return particularDays;
    }


    private void task6(){
        // code your task 6 here
        //declare and initialised
        double radius, areaOfACircle,circumferenceOfACircle,ratioAreaToCircumference, ratioLimit;
        radius = 1;

        //calculate area and circumference and ratio of circles
        areaOfACircle = Math.PI * Math.pow(radius,2);
        circumferenceOfACircle = 2 * Math.PI * radius;
        ratioAreaToCircumference = 0;
        ratioLimit = 30;

        //while ratio less than limit
        while (ratioAreaToCircumference<ratioLimit){

            areaOfACircle = Math.PI*Math.pow(radius,2);
            circumferenceOfACircle = 2*Math.PI*radius;
            ratioAreaToCircumference = areaOfACircle/circumferenceOfACircle;

            //output if less than limit
            if (ratioAreaToCircumference<ratioLimit){
                System.out.println("\nRadius: " + radius);
                System.out.println(String.format("Ratio of area to circumference: %.2f", ratioAreaToCircumference));
            }

            radius += 1;
        }

    }


    private void task7(int size){
        // code your task 7 here
        String toBePrint = "*";
        for(int row = 0; row <size; row++)
        {
            for(int col = 0; col< size; col++)
            {
                if (row == col || row + col == size-1){ //print * when row == col and row + col == size-1
                    System.out.print(toBePrint);
                }
                else                                    //else print space
                    System.out.print(" ");
            }
            System.out.println();                     //move to next row
        }
    }

    private void testing(){
        int degree = 180;
        switch(degree){
            case 0:
                System.out.println("North");
                break;

            case 270:
                System.out.println("East");
                break;

            case 180:
                System.out.println("South");
                break;

            case 90:
                System.out.println("west");
                break;

            default:
                System.out.println("Not valid");
        }
    }
}