package guru.springframework.msscbrewery.services;

import java.util.UUID;

import guru.springframework.msscbrewery.web.model.CustomerDto;

/**
 * Created by jt on 2019-04-21.
 */
public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);

	void updateCustomer(UUID customerId, CustomerDto customerDto);

	UUID createCustomer(CustomerDto customerDto);

	void deleteCustomer(UUID customerId);
}
