package map.pharmacy_recommendation.Pharmacy.repository;

import map.pharmacy_recommendation.Pharmacy.entity.Pharmacy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PharmacyRepository extends JpaRepository<Pharmacy, Long> {

}
