package Inventory.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Inventory.Model.Inventory;

public interface InventoryRepo extends JpaRepository<Inventory, Long> {

	List<Inventory> findBySkuCodeIn(List<String> skuCode);

	
}
