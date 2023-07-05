package guru.springframework.msscssm.repository;

import guru.springframework.msscssm.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by radek on 2023-07-05
 */
@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
