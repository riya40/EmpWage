package com.bridgelabz;

public class EmpWageComputation {
    public static void main(String args[]){

        int wageperhour=20,wage,fulldayhour=8,partimedayhour=4;
        int hours=0;
        //Displaying The Welcome Message
        System.out.println("Welcome To Employee Wage Computation");

        //checking the Employee Presence
        int rand =(int) Math.floor(Math.random()*10)%3;

        //Solving with Switch Case Statement
        switch(rand){
            case 1:
                System.out.println("Employee is Present");
                hours=8;
                break;
            case 2:
                //Adding partTime
                System.out.println("Employee is PartTime");
                hours=4;
                break;
            default:
                System.out.println("Employee is Absent");
                break;
        }
        wage=wageperhour*hours;
        System.out.println("wage is :"+wage);
    }
}
