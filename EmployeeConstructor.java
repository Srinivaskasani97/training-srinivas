import java.io.*;

class Employee
{
    int employee_id;
    float salary;
    float height;
    int weight;
    String bloodGroup;
    String address;
    String college_name;
    String vertical;
    String technology;
    Employee(int employee_id,float salary,float height,int weight,String bloodGroup,String address,String college_name,String vertical,String technology)
    {
        this.employee_id=employee_id;
        this.salary=salary;
        this.height=height;
        this.weight=weight;
        this.bloodGroup=bloodGroup;
        this.address=address;
        this.college_name=college_name;
        this.vertical=vertical;
        this.technology=technology;
        this.display();
    }
    void display(){
        System.out.println("========Employee Details========");
        System.out.println("Employee id="+employee_id);
        System.out.println("Employee salary="+salary);
        System.out.println("Employee height="+height);
        System.out.println("Employee weight="+weight);
        System.out.println("Employee bloodgroup="+bloodGroup);
        System.out.println("Employee address="+address);
        System.out.println("College name="+college_name);
        System.out.println("vertical="+vertical);
        System.out.println("technology="+technology);
    }
    }
    public class EmployeeConstructor{
        public static void main(String args[]){
            Employee Akhil= new Employee(1200,20000.0f,5.9f,65,"B+","H.no:- 1-123 ,Vasavi Nagar, Gajwel","site","Sales","Digital Marketing");
            Employee raju= new Employee(1201,30000.0f,5.7f,55,"AB-","H.no:- 8-229 ,Vasavi Nagar, Gajwel","Site","Development","Flutter");
        }
    }