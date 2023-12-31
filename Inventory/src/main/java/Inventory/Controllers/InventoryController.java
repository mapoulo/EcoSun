package Inventory.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import Inventory.DTO.InventoryResponse;
import Inventory.Services.InventoryService;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/inventory")
@Slf4j
public class InventoryController {

	@Autowired
	private InventoryService inventoryService;
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
//	@SneakyThrows
	public List<InventoryResponse> isInStock(@RequestParam List<String> skuCode) {
//		log.info("Wait started");
//		Thread.sleep(10000);
//		log.info("Wait ended");
		return inventoryService.isPresent(skuCode);
	}
	
	@GetMapping("/value")
	public String value(@RequestParam String value) {
		return "My Inventory Service "+value;
	}
	
	@GetMapping("/inv")
	public String inv() {
		return "Hello Inventory";
	}
}
