package UST;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args){
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(101,"sharath","software","abc@gmail.com",40000.00,"M"));
        list.add(new Employee(102,"sai","admin","abc@gmail.com",60000.00,"M"));
        list.add(new Employee(103,"kiran","testing","abc@gmail.com",40900.00,"M"));
        list.add(new Employee(104,"kumar","software","abc@gmail.com",80000.00,"M"));
        list.add(new Employee(105,"sitha","admin","abc@gmail.com",70000.00,"F"));
        list.add(new Employee(106,"laxmi","software","abc@gmail.com",95000.00,"F"));
        list.add(new Employee(107,"smitha","testing","abc@gmail.com",35000.00,"F"));
        list.add(new Employee(107,"smitha","testing","abc@gmail.com",35000.00,"F"));

//        long malecount = list.stream().filter(e -> e.gender.equals("M")).count();
//        long femalecount = list.stream().filter(e -> e.gender.equals("F")).count();
//        System.out.println(malecount);
//        System.out.println(femalecount);

//        Map<String,Employee> higestpaidfemale= list.stream()
//                .collect(Collectors.groupingBy(Employee::getGender,Collectors.collectingAndThen(Collectors.maxBy(
//                        (e1,e2)->Double.compare(e1.getSalary(),e2.getSalary())),Optional::get)));
//        //System.out.println(higestpaidfemale);
//        Employee higestfemaleemployee = higestpaidfemale.getOrDefault("T",null);
//        System.out.println(higestfemaleemployee);

//        double totalsalarayofsoftwaredepart = list.stream()
//                .filter(e -> e.getDepartment().equals("admin"))
//                .mapToDouble(Employee::getSalary).sum();
//        System.out.println(totalsalarayofsoftwaredepart);

//        List<String> names = list.stream().
//                filter(e->e.getDepartment().equalsIgnoreCase("Testing")).
//                map(Employee::getName)
//                .collect(Collectors.toList());
//        System.out.println(names);

    }
}
