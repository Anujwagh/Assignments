package orderMgtSystem.com.demo.service;

import java.util.List;
import java.util.Map;

import orderMgtSystem.com.demo.beans.Customer;
import orderMgtSystem.com.demo.beans.Item;

public interface OrderService {

	boolean addNewCustomer();

	Map<Customer, List<Item>> displayAll();
	
	Map.Entry<Customer, List<Item>> findByCustomer(int cid);

	boolean deleteById(int cid);

	boolean addNewItem(int cid, Item item);

	boolean removeItemById(int cid, int iid);

}
