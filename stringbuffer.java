class stringbuffer
{
    public static void main(String args[])
    {
        StringBuffer sb1=new StringBuffer("Ram ");
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());
        System.out.println(sb1);
        sb1.reverse();
        System.out.println(sb1);
        sb1.reverse();
        sb1.insert(0,"Sri");
        System.out.println(sb1);
        System.out.println(sb1.insert(7,"Kushal"));
        sb1.setCharAt(3,'r');
        System.out.println(sb1);
    }
} 
