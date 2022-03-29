package tacos.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.domain.Pageable;
import java.util.List;
import tacos.User;
import tacos.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {
	List<Order> findByUserOrderByPlacedAtDesc(User user, Pageable pageable);
}