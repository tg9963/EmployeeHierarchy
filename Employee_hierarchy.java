/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee_hierarchy;


import java.util.*;

/**
 *
 * @author gtanguto
 */
public class Employee_hierarchy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Map<String,Employee> EmployeeIndex=new HashMap<String,Employee>();
       List<Employee> EmployeeList=new ArrayList<Employee>();
       
       createEmployeeList(EmployeeIndex,EmployeeList);
       
       System.out.println(" 1.PrintHierarchy ");
       
       String name_of_employee="Dinesh";
       
       if(EmployeeIndex.containsKey(name_of_employee))
       {
           Employee e=EmployeeIndex.get(name_of_employee);
           print_hierarchy(e);
       }
       else
       {
           System.out.println("No such Employee found ");
       }
       
    }
    
    public static void createEmployeeList(Map<String,Employee> EmployeeIndex,List<Employee> EmployeeList)
    {
        Employee e1=new Employee();
        e1.setName("GOPI");
        e1.setIncome(19000);
        e1.setManager("Dinesh");
        EmployeeIndex.put("GOPI", e1);
        EmployeeList.add(e1);
        
        Employee e3=new Employee();
        e3.setName("Lachi");
        e3.setIncome(19000);
        e3.setManager("Dinesh");
        EmployeeIndex.put("Lachi", e3);
        EmployeeList.add(e3);
        
        Employee e2=new Employee();
        e2.setName("Dinesh");
        e2.setIncome(20000);
        e2.setManager("Harish");
        e2.addDirectReports(e1);
        e2.addDirectReports(e3);
        EmployeeIndex.put("Dinesh", e2);
        EmployeeList.add(e2);
    }
    
    public static void print_hierarchy(Employee e)
    {
        Queue<Employee> q=new LinkedList<>();
        
        q.add(e);
        
        while(!q.isEmpty())
        {
            Employee temp=q.remove();
            System.out.println(temp);
            List<Employee> directReports=temp.getDirectReports();
            Iterator<Employee> list=directReports.iterator();
            while(list.hasNext())
            {
                q.add(list.next());
            }
        }
        
    }
    
}
