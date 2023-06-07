package automate.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import automate.entities.Payment;

public interface PaymentDao extends JpaRepository<Payment, Integer> {

}
