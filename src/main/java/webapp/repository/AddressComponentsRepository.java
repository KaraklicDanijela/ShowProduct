package webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import webapp.model.AddressComponents;


public interface AddressComponentsRepository extends JpaRepository<AddressComponents,Integer> {

}
