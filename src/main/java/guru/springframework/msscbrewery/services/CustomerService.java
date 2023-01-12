package guru.springframework.msscbrewery.services;

import java.util.UUID;

import guru.springframework.msscbrewery.web.model.CustomerDto;

/**
 * @author Sergey Ivanov
 * @since 2023/01/12
 */
public interface CustomerService {
	CustomerDto getCustomerById(UUID uuid);
}
