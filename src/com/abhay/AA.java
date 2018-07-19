package com.abhay;

public class AA
{
    public static void main(String[] args)
    {
        ExtendMe e=new ExtendMe();
        ImplementMe a=ExtendMe::StatDisplay;
        ImplementMe1 b=ExtendMe::display;
        ImplementMe c=e::display;
        ImplementMe d=ExtendMe::new;
        a.display();
        b.display(e);
        c.display();
        d.display();
    }
}
interface ImplementMe
{
    void display();
}
interface ImplementMe1
{
    void display(ExtendMe a);
}
class ExtendMe
{
    void display()
    {
        System.out.println("Hello");
    }
    void display(ExtendMe a)
    {
        System.out.println(this);
        System.out.println("Hello");
    }
    static void StatDisplay()
    {
        System.out.println("static Hello");
    }
    ExtendMe()
    {
        System.out.println("Constructor Hello");
    }
}