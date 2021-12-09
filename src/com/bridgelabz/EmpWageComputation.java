package com.bridgelabz;

public class EmpWageComputation {
    public static void main(String args[]){

        int Wph=20,wage,Fdh=8;
        
        //Displaying The Welcome Message
        System.out.println("Welcome To Employee Wage Computation");

        //checking the Employee Presence
        double rand = Math.floor(Math.random()*10)%2;
        if(rand==1){
            System.out.println("employee present");
            wage= Wph*Fdh;//wage calculation
            System.out.println("the wage is:"+wage);
        }
        else{
            System.out.println("employee absent");
        }
    }
}
