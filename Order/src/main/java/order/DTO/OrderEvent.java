package order.DTO;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderEvent {
    
	private List<String> productName;
	private String orderNumber;
	private int quantity;
}
