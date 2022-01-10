package repo;

import entities.CompanySize;
import entities.Customer;

import java.io.*;
import java.util.*;

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
    public void sortByEmployes(){
        customerRepository.sort(Comparator.comparing(customer -> customer.getNrOfEmployes()));
        Collections.reverse(customerRepository);
    }

    public void addSortedCustomers() throws FileNotFoundException, UnsupportedEncodingException {
        this.sortByEmployes();
        PrintWriter writer = new PrintWriter(" kundensortiert.txt", "UTF-8");
        for(Customer customer:customerRepository){
            String str=""+customer.getId()+","+customer.getCompanyName()+","+customer.getCompanySize()+","+customer.getNrOfEmployes()+","+customer.getIncomeFCustomer()+","+customer.getLocation();
            writer.println(str);
        }

    }
}

