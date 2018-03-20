package com.doing.more.java.example;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class BusinessTest {
    Business testBusiness;
    EmployeeBean bob, jose, sven, ingabrit, noFirstName, noLastName;
    CustomerBean Comfort, Justice, alma, hannah, customerNoFirstName, customerNoLastName;

    @Before
    public void setUp() throws Exception {
        testBusiness = new Business();
        //each employee has a firs and last name, an age, a phone number, and an employee id number
        bob = new EmployeeBean("Bob", "Justice", 23, "(233)555-1818", "132-841Z-Qz0a4");
        jose = new EmployeeBean("Jose", "Gomez", 19, "(233)888-1900", "132-841Z-Qz0a4");
        sven = new EmployeeBean("Sven", "Anderson", 19, "(233)888-1598", "132-841Z-Qz0a4");
        ingabrit = new EmployeeBean("Ingabrit", "Anderson", 19, "(233)888-1599", "132-841Z-Qz0a4");
        noFirstName = new EmployeeBean(null, "Anderson", 19, "(233)888-1599", "132-841Z-Qz0a4");
        noLastName = new EmployeeBean("Justice", null, 19, "(233)888-1599", "132-841Z-Qz0a4");


        Comfort = new CustomerBean("Comfort", "Azikiwe", 23, "(233)555-1818");
        Justice = new CustomerBean("Justice", "Okai", 19, "(233)888-1900");
        alma = new CustomerBean("Alma", "Hernandez", 19, "(233)888-1598");
        hannah = new CustomerBean("Hannah", "Gustavson", 19, "(233)888-1599");
        customerNoFirstName = new CustomerBean(null, "Anderson", 19, "(233)888-1599");
        customerNoLastName = new CustomerBean("Justice", null, 19, "(233)888-1599");
    }

    @Test
    public void testAddEmployee() {
        testBusiness.addEmployee(bob);
        int numEmployees = testBusiness.employees.size();
        assertEquals(1, numEmployees);

        testBusiness.addEmployee(jose);
        testBusiness.addEmployee(sven);
        testBusiness.addEmployee(ingabrit);
        numEmployees = testBusiness.employees.size();
        assertEquals(4, numEmployees);

        testBusiness.addEmployee(null);
        numEmployees = testBusiness.employees.size();
        assertEquals(4, numEmployees);

        testBusiness.addEmployee(noLastName);
        numEmployees = testBusiness.employees.size();
        assertEquals(4, numEmployees);

        testBusiness.addEmployee(noFirstName);
        numEmployees = testBusiness.employees.size();
        assertEquals(4, numEmployees);

        testBusiness.employees.clear();
    }

    @Test
    public void testGetEmployee() {
        testBusiness.employees.put("Justice, Bob", bob);
        testBusiness.employees.put("Gomez, Jose", jose);
        testBusiness.employees.put("Anderson, Sven", sven);
        testBusiness.employees.put("Anderson, Ingabrit", ingabrit);

        EmployeeBean bobFromMap = testBusiness.getEmployee("Justice, Bob");
        assertEquals(bob, bobFromMap);
        EmployeeBean joseFromMap = testBusiness.getEmployee("Gomez, Jose");
        assertEquals(jose, joseFromMap);
        EmployeeBean svenFromMap = testBusiness.getEmployee("Anderson, Sven");
        assertEquals(sven, svenFromMap);
        EmployeeBean ingabritFromMap = testBusiness.getEmployee("Anderson, Ingabrit");
        assertEquals(ingabrit, ingabritFromMap);

        EmployeeBean notEmployee = testBusiness.getEmployee("Body, No");
        assertNull(notEmployee);

        testBusiness.employees.clear();
    }

    @Test
    public void testAddCustomer() {

        testBusiness.addCustomerToPhoneBook(Comfort);
        int numEmployees = testBusiness.customerPhoneBook.size();
        assertEquals(1, numEmployees);

        testBusiness.addCustomerToPhoneBook(Justice);
        testBusiness.addCustomerToPhoneBook(alma);
        testBusiness.addCustomerToPhoneBook(hannah);
        numEmployees = testBusiness.customerPhoneBook.size();
        assertEquals(4, numEmployees);

        testBusiness.addCustomerToPhoneBook(null);
        numEmployees = testBusiness.customerPhoneBook.size();
        assertEquals(4, numEmployees);

        testBusiness.addCustomerToPhoneBook(customerNoLastName);
        numEmployees = testBusiness.customerPhoneBook.size();
        assertEquals(4, numEmployees);

        testBusiness.addCustomerToPhoneBook(customerNoFirstName);
        numEmployees = testBusiness.customerPhoneBook.size();
        assertEquals(4, numEmployees);

        testBusiness.customerPhoneBook.clear();
    }

    @Test
    public void testGetCustomerPhoneNumber() {

        testBusiness.customerPhoneBook.put("Azikiwe, Comfort", Comfort.getPhoneNumber());
        testBusiness.customerPhoneBook.put("Okai, Justice", Justice.getPhoneNumber());
        testBusiness.customerPhoneBook.put("Hernandez, Alma", alma.getPhoneNumber());
        testBusiness.customerPhoneBook.put("Gustavson, Hannah", hannah.getPhoneNumber());

        String ComfortPhone = testBusiness.getCustomerPhoneNumber("Azikiwe, Comfort");
        assertEquals("(233)555-1818", ComfortPhone);

        String JusticePhone = testBusiness.getCustomerPhoneNumber("Okai, Justice");
        assertEquals("(233)888-1900", JusticePhone);

        String nullPhone = testBusiness.getCustomerPhoneNumber(null);
        assertNull(nullPhone);

        String notCustomer = testBusiness.getCustomerPhoneNumber("Body, No");
        assertNull(notCustomer);
        testBusiness.customerPhoneBook.clear();
    }

    @Test
    public void testGetAllCustomerPhoneNumbers() {
        testBusiness.customerPhoneBook.put("Azikiwe, Comfort", Comfort.getPhoneNumber());
        testBusiness.customerPhoneBook.put("Okai, Justice", Justice.getPhoneNumber());
        testBusiness.customerPhoneBook.put("Hernandez, Alma", alma.getPhoneNumber());
        testBusiness.customerPhoneBook.put("Gustavson, Hannah", hannah.getPhoneNumber());

        String phoneBook = testBusiness.getAllCustomerPhoneNumbers();
        String expected = "Okai, Justice - (233)888-1900; Azikiwe, Comfort - (233)555-1818; Gustavson, Hannah - (233)888-1599; Hernandez, Alma - (233)888-1598; ";
        assertEquals(expected, phoneBook);
        testBusiness.customerPhoneBook.clear();
    }
}