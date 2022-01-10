package repo;

import entities.CompanySize;
import entities.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerRepository {
    private ArrayList<Customer> customerRepository;

    public CustomerRepository(ArrayList<Customer> customerRepository) {
        this.customerRepository = customerRepository;
    }

    public ArrayList<Customer> getCustomerRepository() {
        return customerRepository;
    }

    public void addCustomer(Customer customer){
        this.customerRepository.add(customer);
    }

    public void readFromFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
                ArrayList<String> elephantList = (ArrayList<String>) Arrays.asList(line.split(","));
                Customer customer=new Customer(Integer.parseInt(elephantList.get(0)),elephantList.get(1), CompanySize.valueOf(elephantList.get(2)),Integer.parseInt(elephantList.get(3)),Long.getLong(elephantList.get(4)),elephantList.get(5));
                customerRepository.add(customer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            br.close();
        }
    }
}