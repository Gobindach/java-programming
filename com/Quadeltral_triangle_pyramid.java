package com;
import static java.lang.System.*;

public class Quadeltral_triangle_pyramid 
{
    public static void main(String[] args) 
    {
        int n = 5;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                // Prints '%' on the left edge, bottom edge, and diagonal edge
                if (j == 1 || i == n || j == i)
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
