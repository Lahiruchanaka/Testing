package lk.ijse.pos.dao;

import lk.ijse.pos.model.Customer;
import lk.ijse.pos.model.Item;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OrderDAOImpl {
    public ArrayList<Customer> getAllCustomer() throws SQLException {
        PreparedStatement pstm = connection.prepareStatement("SELECT * FROM Customer WHERE id=?");
        pstm.setObject(1, Customer);
        ResultSet rst = pstm.executeQuery();
        ArrayList<Customer> allCustomers = new ArrayList<>();
        while (rst.next()) {
            Customer customer = new Customer(rst.getString(1), rst.getString(2), rst.getString(3));
            allCustomers.add(customer);
        }
        return allCustomers;
    }

    public ArrayList<Item> getAllItems() throws Exception {


        PreparedStatement pstm = connection.prepareStatement("SELECT * FROM Item WHERE code = ?");
        pstm.setObject(1, itemCode);

        ResultSet rst = pstm.executeQuery();
        ArrayList<Item> allItems = new ArrayList<>();
        while (rst.next()) {
            Item item = new Item(rst.getString(1),
                    rst.getString(2),
                    rst.getBigDecimal(3),
                    rst.getInt(4));
            allItems.add(item);
        }
        return allItems;

    }
}