package orderMgtSystem.com.demo.dao;

import java.util.List;
import java.util.Map;

import orderMgtSystem.com.demo.beans.Customer;
import orderMgtSystem.com.demo.beans.Item;

public interface OrderDao {
	boolean save(Customer c, List<Item> lst);

	Map<Customer, List<Item>> findAll();
	
	Map.Entry<Customer, List<Item>> findById(int cid);

	boolean removeById(int cid);

	boolean addNewItem(int cid, Item item);

	boolean deleteById(int cid, int iid);

}
