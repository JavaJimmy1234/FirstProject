package FirstProject.Java;

public class HelloWorld
{
    public static void main(int num)
    {
        if(num == 1) {
            HelloWorldMessage();
        }
        if(num == 2) {
            WhatsUpDudes();
        }
    }
    public static void HelloWorldMessage()
    {
        System.out.println("Hello World!");
    }
    public static void WhatsUpDudes()
    {
        System.out.println("Hey, whats up my dudes? Hows it going!");
    }
}
