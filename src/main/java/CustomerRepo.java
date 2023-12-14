import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CustomerRepo {
    Map<Integer, Customer> customerMap = new HashMap<>();
    public void creatCustomer(int id, String firstName, String lastName, String email, String phoneNumber, String address, String city, String state, String zipCode, String country){
        customerMap.put(id,new Customer(id, firstName, lastName, email, phoneNumber, address, city, state, zipCode, country));
    }
    public Customer getCustomer(int id){
        return customerMap.get(id);
    }
    public void updateCustomer(int id,Customer customer){
        customerMap.put(id,new Customer(customer.id(),customer.firstName(),customer.lastName(),customer.email(),customer.phoneNumber(),customer.address(),customer.city(),customer.state(),customer.zipCode(),customer.country()));
    }
    public void deleteCustomer(int id){
        customerMap.remove(id);
    }
    public Customer getCustomerByEmail(String email){
        for (Customer customer:customerMap.values()) {
            if (customer.email().equals(email))
                return customer;
        }
        return null;
    }
    public Customer getCustomerByPhoneNumber(String phoneNumber){
        for (Customer customer:customerMap.values()) {
            if (customer.phoneNumber().equals(phoneNumber))
                return customer;
        }
        return null;
    }
    public Customer getCustomerByAddress(String address){
        for (Customer customer:customerMap.values()) {
            if (customer.address().equals(address))
                return customer;
        }
        return null;
    }
    public Customer getCustomerByCity(String city){
        for (Customer customer:customerMap.values()) {
            if (customer.city().equals(city))
                return customer;
        }
        return null;
    }
    public Customer getCustomerByState(String state){
        for (Customer customer:customerMap.values()) {
            if (customer.state().equals(state))
                return customer;
        }
        return null;
    }
    public Customer getCustomerByZipCode(String zipCode){
        for (Customer customer:customerMap.values()) {
            if (customer.zipCode().equals(zipCode))
                return customer;
        }
        return null;
    }
    public Customer getCustomerByCountry(String country){
        for (Customer customer:customerMap.values()) {
            if (customer.country().equals(country))
                return customer;
        }
        return null;
    }
    public Customer getCustomerByFirstName(String firstName){
        for (Customer customer:customerMap.values()) {
            if (customer.firstName().equals(firstName))
                return customer;
        }
        return null;
    }
    public Customer getCustomerByLastName(String lastName){
        for (Customer customer:customerMap.values()) {
            if (customer.lastName().equals(lastName))
                return customer;
        }
        return null;
    }
    public Customer getCustomerByFullName(String firstName,String lastName){
        for (Customer customer:customerMap.values()) {
            if (customer.firstName().equals(firstName) && customer.lastName().equals(lastName))
                return customer;
        }
        return null;
    }
    public Customer getCustomerByFullName(String fullName){
        String[] name = fullName.split(" ");
        for (Customer customer:customerMap.values()) {
            if (customer.firstName().equals(name[0]) && customer.lastName().equals(name[1]))
                return customer;
        }
        return null;
    }
    public Customer getCustomerByFullAddress(String address,String city,String state,String zipCode,String country){
        for (Customer customer:customerMap.values()) {
            if (customer.address().equals(address) && customer.city().equals(city) && customer.state().equals(state) && customer.zipCode().equals(zipCode) && customer.country().equals(country))
                return customer;
        }
        return null;
    }
    public Customer getCustomerByFullAddress(String fullAddress){
        String[] address = fullAddress.split(",");
        for (Customer customer:customerMap.values()) {
            if (customer.address().equals(address[0]) && customer.city().equals(address[1]) && customer.state().equals(address[2]) && customer.zipCode().equals(address[3]) && customer.country().equals(address[4]))
                return customer;
        }
        return null;
    }
    public List<Customer> getAllCustomers(){
        return customerMap.values().stream().collect(Collectors.toList());
    }
}
