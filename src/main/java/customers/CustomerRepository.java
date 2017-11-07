package customers;

import java.util.Collection;
import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
    
    List<Customer> findByLastNameAndFirstNameAllIgnoreCase(String lastName, String firstName);
    
    Collection<Customer> findAll(Sort sort);
}
