package In.Abdul.controller;


import In.Abdul.entity.Employee;
import In.Abdul.servcie.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee) throws Exception {
        return employeeService.addEmployee(employee);
    }



}
