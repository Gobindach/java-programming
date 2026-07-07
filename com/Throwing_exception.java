package com;

import static java.lang.System.*;
import java.util.Scanner;

public class Throwing_exception 
{
    public static void main(String[] args) throws ClassCastException
    {
        // Use try-with-resources to automatically close the Scanner
        try (Scanner sc = new Scanner(System.in)) 
        {
            out.print("Enter the name: ");
            String name = sc.nextLine();
            out.println("You entered: " + name);
        }
        catch(Exception e)
        {
            err.println("An error occurred: " + e.getMessage());
        }
    }
}
