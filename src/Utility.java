/**
 * @Author : Samyam Kafle
 * @Portfolio : https://samyamkafle.com.np
 * @Project : Assignment2
 * @CreatedDate : 25/11/2024, Monday
 **/
public class Utility {
    public static int add(int num1, int num2){
        return num1+num2;
    }

    public static int substract(int num1, int num2){
        return num1-num2;
    }

    public static double divide(int num1, int num2){
        return num1/num2;
    }

    public static String calculateGrade(int percentage) {
        // Logic for calculating the grade here
        if (percentage > 90)
            return "First";
        else if(percentage > 70 && percentage <= 90)
            return "Second";
        else if(percentage > 50 && percentage <= 70)
            return "Third";
        else if(percentage > 20 && percentage <= 50)
            return "Fourth";
        else
            return "Fail";
    }
}
