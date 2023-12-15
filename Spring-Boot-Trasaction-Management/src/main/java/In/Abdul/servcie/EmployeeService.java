package In.Abdul.servcie;


import In.Abdul.entity.Address;
import In.Abdul.entity.Employee;
import In.Abdul.repository.AddressRepository;
import In.Abdul.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private AddressRepository addressRepository;


    @Transactional
    public Employee addEmployee(Employee employee) throws Exception {

        Employee empSave = employeeRepository.save(employee);

        if (empSave.getName().contains("code")) throw new Exception();

        Address addAddress = new Address();
        // id is auto generated
        addAddress.setName("Rajampet");
        addAddress.setEmployee_id(empSave);
        addressRepository.save(addAddress);


        return empSave;
    }
}
