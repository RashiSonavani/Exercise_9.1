package com.company;

class Exception {

    public static class cl1 {
        public void getexce()
        {
            System.out.println("Hello this is before Exception!");

        }
    }


    public static void main(String[] args)
    {
        try
        {
            cl1 exception = new cl1();
            exception.getexce();
        }
        catch (NullPointerException e)
        {
            System.out.println("There is an Error");
            System.out.println(e);
            e.getMessage();
        }


    }
}
