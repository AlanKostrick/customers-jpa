package customers;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

@Component
public class CustomerPopulator implements CommandLineRunner {

	private Logger log = LoggerFactory.getLogger(CustomerPopulator.class);

	@Resource
	private CustomerRepository repository;

	@Override
	public void run(String... args) throws Exception {
		// save a couple of customers
		repository.save(new Customer("Jack", "Bauer"));
		repository.save(new Customer("Chloe", "O'Brian"));
		repository.save(new Customer("Kim", "Bauer"));
		repository.save(new Customer("David", "Palmer"));
		repository.save(new Customer("Michelle", "Dessler"));
		repository.save(new Customer("Alan", "Kostrick"));
		repository.delete(repository.findByLastNameAndFirstNameAllIgnoreCase("Bauer", "Jack"));
		repository.save(new Customer("Jack", "Bauer"));
//		// fetch all customers
//		log.info("Customers found with findAll():");
//		log.info("-------------------------------");
//		for (Customer customer : repository.findAll()) {
//			log.info(customer.toString());
//		}
//		log.info("");
//
//		// fetch an individual customer by ID
//		Customer customer = repository.findOne(1L);
//		log.info("Customer found with findOne(1L):");
//		log.info("--------------------------------");
//		log.info(customer.toString());
//		log.info("");
//
//		// fetch customers by last name
//		log.info("Customer found with findByLastName('Bauer'):");
//		log.info("--------------------------------------------");
//		for (Customer bauer : repository.findByLastName("Bauer")) {
//			log.info(bauer.toString());
//		}
//		log.info("");
//
//		// fetch customers by last name and first name
//		log.info("Customer found with last name and first name");
//		log.info("--------------------------------------------");
//		for (Customer bauer : repository.findByLastNameAndFirstNameAllIgnoreCase("Bauer", "Jack")) {
//			log.info(bauer.toString());
//		}
//		log.info("");
//
//
//		// fetch customers by last name and sort
//		log.info("Customer found with last name sort");
//		log.info("--------------------------------------------");
//		for (Customer current : repository.findAll(new Sort("lastName"))) {
//			log.info(current.toString());
//		}
//		log.info("");

	}

}
