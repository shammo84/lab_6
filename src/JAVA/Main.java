package JAVA;

public class Main {
    public static void main(String[] args)
    {
        animal a1;
        //animal a2;
        land l= new land();
        a1=l;
        //birds b=new birds();
        //a2=b;
        try
        {
            if(a1 instanceof oviparous)
            {
                System.out.println(a1.canmove());

                System.out.println("oviparous");
            }
            else if(a1 instanceof mammal)
            {
                System.out.println(a1.canmove());

                System.out.println("mammal");
            }

        }
        catch (Exception e)
        {
            System.out.println("no");
        }
    }
}
