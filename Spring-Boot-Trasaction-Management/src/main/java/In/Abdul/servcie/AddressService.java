package In.Abdul.servcie;


import In.Abdul.entity.Address;
import In.Abdul.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;


    @Transactional
    public void AddAddress(Address address) {
        addressRepository.save(address);  // no return value here
    }
}
