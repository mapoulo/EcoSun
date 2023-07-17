package order.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import order.Model.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
