package GDDEurope17.nulls;

import GDDEurope17.data.CustomerJava;

public class Nulls {

    public void validateCustomer(CustomerJava customerJava) throws SecurityException {
        if(customerJava != null) {
            if(customerJava.getName() != null) {
                if(customerJava.getName().startsWith("A")) {
                    throw new SecurityException("Name in A in first not allowed");
                }
            }
        }
    }

    public CustomerJava getCustomerById(int id) {
        if(id > 0) {
            return new CustomerJava("Abdy", "Jalan", 24);
        } else {
            return null;
        }
    }
}
