package builder;

public class Application {
    public static void main(String[] args) {

        //builder for EmpOne
        Employee.Builder builder = new Employee.Builder("empOne");
        //EmpOne
        Employee empOne = builder.email("abc@mail.com").age(25).mobileNumber(1234567809).build();
        System.out.println("___________________EmpOne___________________");
        System.out.println(empOne);

        //builder for EmpTwo
        Employee.Builder builder1 = new Employee.Builder("empTwo");
        //EmpTwo
        Employee empTwo = builder1.email("def@mail.com").mobileNumber(1234567809).build();
        System.out.println("___________________EmpTwo___________________");
        System.out.println(empTwo);

        //must use individual builders
    }
}
