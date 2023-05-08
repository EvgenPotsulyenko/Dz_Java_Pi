package Dz_Pi;

public class Formyla_pi 
{

    public static void main(String[] args) 
    { 
        double n = 2;
        double p = 3 + 4/(n *(n+1)*(n+2)) - 4/((n+2)*(n+3)*(n+4)) + 4/((n+4)*(n+5)*(n+6));      
        int j = 1;

        for(double i = 8;i < 100000;i += 6)
        {
            if(j == 1)
            {                
                p -= 4/(i *(i+1)*(i+2)) - 4/((i+2)*(i+3)*(i+4)) + 4/((i+4)*(i+5)*(i+6));             
                j = 0;            
            }
            else if(j == 0)
            {
                p += 4/(i *(i+1)*(i+2)) - 4/((i+2)*(i+3)*(i+4)) + 4/((i+4)*(i+5)*(i+6));
                j = 1;
            }
        }
        System.out.println(p);

     }         
}
