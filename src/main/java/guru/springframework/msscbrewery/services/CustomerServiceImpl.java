package guru.springframework.msscbrewery.services;

import java.util.UUID;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 2019-04-21.
 */
@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
	@Override
	public CustomerDto getCustomerById(UUID customerId) {
		return CustomerDto.builder()
				.id(UUID.randomUUID())
				.name("Joe Buck")
				.build();
	}

	@Override
	public void updateCustomer(final UUID customerId, final CustomerDto customerDto) {
		log.info("Updated customer with ID: " + customerId);
	}

	@Override
	public UUID createCustomer(final CustomerDto customerDto) {
		final UUID uuid = UUID.randomUUID();
		log.info("Created customer with ID: " + uuid);
		return uuid;
	}

	@Override
	public void deleteCustomer(final UUID customerId) {
		log.info("Deleted customer with ID: " + customerId);
	}
}
