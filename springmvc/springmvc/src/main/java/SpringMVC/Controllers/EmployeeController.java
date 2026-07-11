package SpringMVC.Controllers;

import SpringMVC.Models.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/emp")
public class EmployeeController {

    private List<Employee> EmployeeList=new ArrayList<>();
//    For recieving data - 3 methods --> @Path variable
    @PostMapping("/register")
    public String registerEmployee(@RequestBody Employee employee){
        EmployeeList.add(employee);
        return employee.getName()+"You are registered";

    }


    @GetMapping("/getall")
    public List<Employee> getAllEmployees(){
//        return EmployeeList.stream().filter(String department);
        return EmployeeList;
    }


    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable int id){
// public Employee getEmployeeById(@PathVariable(name="id" int Employeeid){   if want to use different name instead of id
//
        for(Employee e: EmployeeList){
            if(e.getId()==id){
                return e;
            }

        }
        return null;
    }
    @GetMapping("/search")
    public Employee searchEmployee(@RequestParam(required = false) String department){ //if not dept not given then also handle
        for(Employee e : EmployeeList){
            if(e.getDepartment().equalsIgnoreCase(department)){
                return e;
            }

        }
        return null;
    }

    //Put- Id bata do sirf - id ke hishab se data change 1-2 fields ke liye this is good
    //Patch- IF want to change full object - Patch
    @PutMapping("/update/{id}")
    public String updateEmployee(@PathVariable int id , @RequestBody Employee updatedEmployee){
        for(Employee e:EmployeeList){
            if(e.getId()==id){
                e.setName(updatedEmployee.getName());
                e.setDepartment(updatedEmployee.getDepartment());
                e.setSalary(updatedEmployee.getSalary());
                return "Employee details updated !";
            }

        }
        return "Employee not found";
    }

    @DeleteMapping("{id}")
    public String deleteEmployee(@PathVariable int id){
        for(Employee e:EmployeeList){
            if(e.getId()==id){
                EmployeeList.remove(e);
            }
            return "Employee not found";
        }
        return "Employee deleted";
    }


    // Welcome API
    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to employee management";
    }


}
