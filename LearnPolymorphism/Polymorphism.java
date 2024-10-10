/**
 * Polymorphism -> 
 *  poly -> many
 *  morphs -> forms
 * 
 *  1. static polymorphism  eg. Method overloading
 *  2. dynamic polymorphism eg. method overriding
 * 
 */
class Customer
{
    void pay()
    {
        System.out.println("how much to pay ? or whom ?");
    }
    void pay(int money,String empName)
    {
        System.out.println("paying "+money+" to "+empName);
    }
    // void pay(int money,String upiId) // error
    // int pay(int money,String upiId) // error
    void pay(String upiId,int money)
    {
        System.out.println("paying "+money+" at "+upiId);
    }
    
    void pay(byte money)
    {
        System.out.println("paying "+money+" cash at tea stall");
    }
    void pay(int money) // to achieve method overloading the no. of arguments or the data type of arguments must be different
    {
        System.out.println("whom to pay "+money+" rs.");
    }
    void pay(long money)
    {
        System.out.println("paying "+money+" through card at shopping mall");
    }
    void pay(float smsCharge)
    {
        System.out.println("deducting "+smsCharge+" sms charge ");
    }
    void pay(double premium)
    {
        System.out.println("deducting "+premium+" health insurance premium.");
    }
}
class Polymorphism
{
    public static void main(String[] args) {
        
       Customer c=new Customer();
        //c.pay();
        // c.pay((byte)10);
        // c.pay(12000000000000000L);
        // c.pay(12.50f);

        // System.out.println


    }
}