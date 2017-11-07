package customers;

import javax.annotation.Resource;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {

	@Resource
	CustomerRepository customerRepo;

	@RequestMapping("/")
	public String getAllCustomersIndex(Model model) {
		model.addAttribute("customers", customerRepo.findAll());
		return "customers";
	}
	
	@RequestMapping("/customers")
	public String getAllCustomers(Model model) {
		model.addAttribute("customers", customerRepo.findAll());
		return "customers";
	}
	
	@RequestMapping("/bauer")
	public String getAllBauers(Model model) {
		model.addAttribute("customers", customerRepo.findByLastName("Bauer"));
		return "customers";
	}
	
	@RequestMapping("/customers-sorted")
	public String getAllCustomersSorted(Model model) {
		model.addAttribute("customers", customerRepo.findAll(new Sort("lastName", "firstName")));
		return "customers";
	}

}
