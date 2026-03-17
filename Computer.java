public class Computer{
       String color="Grey";
    int ram=16;
    double price=14500;
    void writecode()
    {
        System.out.println("I am learning coding");
    }
    public static void main (String[] args){
        Computer com = new Computer();
        System.out.println(com.color);
        System.out.println(com.ram);
    }
}