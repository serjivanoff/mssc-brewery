package guru.springframework.msscbrewery.web.controller;

import java.util.UUID;

import guru.springframework.msscbrewery.services.CustomerService;
import guru.springframework.msscbrewery.web.model.CustomerDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sergey Ivanov
 * @since 2023/01/12
 */
@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {

	private final CustomerService service;

	public CustomerController(final CustomerService service) {
		this.service = service;
	}

	@GetMapping({"/{customerId}"})
	public ResponseEntity<CustomerDto> getCustomer(@PathVariable UUID customerId) {
		return 	ResponseEntity.ok(service.getCustomerById(customerId));
	}

}
