class ConnectionProvider
{
    static void getConnection()
    {
        System.out.println("connected...");
    }
}
public class Static 
{
    static void fxn()
    {
        System.out.println("hii");
    }

    public static void main(String[] args) {
        
        ConnectionProvider.getConnection();
        fxn();
    }
}