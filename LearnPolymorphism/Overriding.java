/**
 * Overriding
 */
class Employee
{
    double chargePerHour;
    double salary;
    Employee()
    {
        chargePerHour=100;
    }
    void calclateSalary(double hours)
    {
        salary=30*chargePerHour*hours;
    }
    void showEmpDetails()
    {
        System.out.println("Charge perhour :"+chargePerHour);
    }
}
class Intern extends Employee
{
    double travelAllowance;
    Intern()
    {
        chargePerHour=25;
    }
    @Override
    void calclateSalary(double hours)
    {
        salary=30*chargePerHour*hours;
        getTravelAllowance();
    }
    @Override
    void getTravelAllowance()
    {
        travelAllowance=3000;
    }
    void showEmpDetails()
    {
        System.out.println("*********** Intern Details ************");
        System.out.println("Expected salary :"+salary);
        System.out.println("Got Travel allowance of "+3000);
        System.out.println("Net salary :"+(salary+travelAllowance));
        super.showEmpDetails();
    }
}
class PermanentEmployee extends Employee
{
    double healthInsurancePremium;
    PermanentEmployee()
    {
        chargePerHour=150;
    }
    void calclateSalary(double hours)
    {
        salary=30*chargePerHour*hours;
        deducthealthInsurancePremium();
    }
    void deducthealthInsurancePremium()
    {
        healthInsurancePremium=salary*0.15;
    }
    
    void showEmpDetails()
    {
        System.out.println("*********** Permanent Employee Details ************");
        System.out.println("Expected salary :"+salary);
        System.out.println("deducted health insurance premium of "+healthInsurancePremium);
        System.out.println("Net salary :"+(salary-salary*0.15));
        super.showEmpDetails();
    }
}


public class Overriding {

    public static void main(String[] args) {
        
        Intern i=new Intern();
        i.calclateSalary(8);
        i.showEmpDetails();

        PermanentEmployee p=new PermanentEmployee();
        p.calclateSalary(9.5);
        p.showEmpDetails();


    }
}