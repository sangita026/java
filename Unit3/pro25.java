class pro25
{
    public static void main (String args[])
    {
        try
        {
            int a[] = {10,20,30};
            int b = 10/0;
            System.out.println(a[5]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception: cannot divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("array index exception: index is out of range");
        }
        catch(Exception e)
        {
            System.out.println("some other exceotion occurred");
        }

    }



}