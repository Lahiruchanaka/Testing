package lk.ijse.pos.dao;

import lk.ijse.pos.model.Customer;

import java.util.ArrayList;

public interface CustomerDAO {
    public boolean addCustomer(Customer customer) throws Exception;
    public boolean updateCustomer(Customer customer) throws Exception;
    public boolean deletaCustomer(String  id) throws Exception;
    public Customer SearchCustomer(String id) throws Exception;
    public ArrayList<Customer> getAll() throws Exception;
}
