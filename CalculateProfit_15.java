package com.web.java;

import java.util.Scanner;

public class CalculateProfit_15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the cost price");
		double cp=sc.nextDouble();
		System.out.println("enter the selling price");
         double sp=sc.nextDouble();
         double profit=0.0;
         if(sp>cp)
         {
         profit=sp-cp;
         }
         System.out.println("The profit is="+profit);
	}

}
