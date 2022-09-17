package co.lecompany.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.lecompany.backend.data.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
