package order.Exceptions;

public class ItemNoInStockEception extends RuntimeException {
	
    public ItemNoInStockEception() {
    	super();
    }
    
    public ItemNoInStockEception(String msg) {
    	super(msg);
    }

}
