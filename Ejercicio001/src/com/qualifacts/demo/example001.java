package com.qualifacts.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class example001 {

	public static void main(String[] args) {
		BufferedReader in; 
		in=new BufferedReader(
					new InputStreamReader(System.in)); 
		System.out.println("Introduzca un numero entero y positivo"); 
		int a = 0;
		try {
			a = Integer.parseInt(in.readLine());
		} catch (NumberFormatException | IOException e) {
			System.out.println("Por favor verifique el número ingresado!");
			return;
//			e.printStackTrace();
		} 
		if(a%2==0) System.out.println("El numero es par"); 
		else System.out.println("El numero es impar"); 
	}

}
