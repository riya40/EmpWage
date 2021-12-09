package com.bridgelabz;

public class EmpWageComputation {
    public static void main(String args[]){

        int wageperhour=20,wage,fulldayhour=8,partimedayhour=4;
        
        //Displaying The Welcome Message
        System.out.println("Welcome To Employee Wage Computation");

        //checking the Employee Presence
        double rand = Math.floor(Math.random()*10)%3;
        if(rand==1){
            System.out.println("employee present");
            wage= wageperhour*fulldayhour;//wage calculation
            System.out.println("the wage is:"+wage);
        }
        else if(rand==2){
            //adding parttime
            System.out.println("employee parttime");
            wage=wageperhour*partimedayhour;
            System.out.println("the wage is:"+wage);
        }
        else{
            System.out.println("Employee Absent");
        }
    }
}
