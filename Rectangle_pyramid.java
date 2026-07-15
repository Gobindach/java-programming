package com;
import static java.lang.System.*;

public class Rectangle_pyramid 
{
    public static void main(String[] args) 
    {
        int n = 5;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++) // Changed to j <= n for a rectangle
            {
                if (i == 1 || i == n || j == 1 || j == n)
                {
                    out.print("%");
                }
                else
                {
                    out.print(" ");
                }
            }
            out.println(); // Fixed: Now inside the outer loop to create rows
        }
    }
}
