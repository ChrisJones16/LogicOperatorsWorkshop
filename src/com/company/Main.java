package com.company;

public class Main {

    public static void main(String[] args) {
	/*
	Relational Operators: <; <=; >; >=; ==(used to compare values, not assign); != (not equal to)
	Logical Operators: && - AND; || - OR; ! - NOT
	 */
	int a = 2;
	int b = 4;
	int x = 6;
	int y = 1;

	System.out.println("a = 2");
	System.out.println("b = 4");
	System.out.println("x = 6");
	System.out.println("y = 1");

	// OR operator
	if(a == x || y + y == a) {
	    System.out.println("a == x || y == a");
	}
	// will run because one of our conditions is true and the OR statement only requires only one statement to be true

    // AND operator
    if(a == x && y + y == a) {
	    System.out.println("a == x && y == a");
    }
    // will not run because one of our conditions is false and the AND statement requires both statements be true

    // NOT operator
    if(a != x && y + y == a){
	    System.out.println("a != x && y + y = a");
    }
    //will run because the NOT operator makes both of our conditions are true

    if(a < b) {
            System.out.println("a < b");
    }
        //will run because variable a has a lower value than variable b

    if(a <= b) {
	    System.out.println("a <= b");
    }
        //will run because the comparison is true

    if(a > y) {
	    System.out.println("i run");
     }

     if(x >= a) {
	    System.out.println("x >= a");
     }

     if(x == y) {
	    System.out.println("this clearly won't work");
     }
     // won't run because x=6 does not equal y=1

     int number = 6;

	if(x == number) {
	    System.out.println("this should run");
    }
    //will run because x=6 and the variable number=6


     if(x != 1) {
	    System.out.println("this works");
     }












    }
}
