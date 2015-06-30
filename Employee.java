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
public class Employee {
    String name;
    int income;
    String manager;
    List<Employee> directReports=new ArrayList<Employee>();
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name=name;
    }
    
    public void setIncome(int income)
    {
        this.income=income;
    }
    
    public int getIncome()
    {
        return income;
    }
    
    public String getManager()
    {
        return manager;
    }
    
    public void setManager(String Manager)
    {
        this.manager=Manager;
    }
    
    public List<Employee> getDirectReports()
    {
        return this.directReports;
    }
    
    public void setDirectReports(List<Employee> directReports)
    {
        this.directReports=directReports;
    }
    
    public void addDirectReports(Employee e)
    {
        directReports.add(e);
    }
    
    public String toString()
    {
        System.out.println(this.name+" , "+this.income+" , and his manager: "+this.manager);
        Iterator<Employee> it=directReports.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next().getName()+" Reports to "+this.name);
        }
        return "\n";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.name);
        return hash;
    }
    
    public boolean equals(Object o)
    {
        if(o==null)return false;
        if(o==this)return true;
        
        Employee e=(Employee)o;
        return this.name.equals(e.name);
    }
    
    
}
