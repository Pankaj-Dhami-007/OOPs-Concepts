interface RBI 
{
    default void common()
    {

    }
}
interface OfflineBank
{

}
interface OnlineCreditApp
{

}
interface OnlineBank
{

}
class PNB implements OfflineBank
{

}
class PnbLocalBranch extends PNB implements OnlineBank
{

}
class Cafe extends PNB implements OnlineBank,OnlineCreditApp
{

}
class Interfaces 
{
    public static void main(String[] args) {
        
        // class extends class 
        // class implements interface 
        // interface extends interface 
        // interface doesn't extends or implements class 

        // a class can extend a class and implements one or more interfaces 
        //      Hybrid inheritance
        //         Cat
        // Tiger        Lion
        //       Liger
    }
}