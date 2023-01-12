package guru.springframework.msscbrewery.services;

import java.util.UUID;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

/**
 * @author Sergey Ivanov
 * @since 2023/01/12
 */
@Service
public class CustomerServiceImpl implements CustomerService {
	@Override
	public CustomerDto getCustomerById(final UUID uuid) {
		return CustomerDto.builder().name("ImportantCustomer").id(UUID.randomUUID()).build();
	}

}
