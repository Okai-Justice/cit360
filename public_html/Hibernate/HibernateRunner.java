
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HibernateRunner {
    private List<User> users;
    private HibernateConfig theHibernateUtility;

    public HibernateRunner(){
        theHibernateUtility = new HibernateConfig();
    }

    public static void main(String[] args){

        HibernateRunner aSillyHibernateUseExample = new HibernateRunner();
        aSillyHibernateUseExample.addNewUsers();
        aSillyHibernateUseExample.showAllUsers();
        aSillyHibernateUseExample.modifyUser();
        aSillyHibernateUseExample.addSharedPhoneNumber();
        aSillyHibernateUseExample.deleteAddedUsers();

    }


    private void addNewUsers() {
        Session session = theHibernateUtility.getCurrentSession();
       
        Transaction transaction = session.beginTransaction();
     
        User aNameUser = new User();
        aNameUser.setUname("aName");
        aNameUser.setPword("aPass");

        User leeUser = new User();
        leeUser.setUname("lee");
        leeUser.setPword("barney");

   
        session.save(aNameUser);
        session.save(leeUser);
        transaction.commit();
   
        System.out.println("aUser generated ID is: " + aNameUser.getId());
        System.out.println("anotherUser generated ID is: " + leeUser.getId());
    }
    private void showAllUsers() {
        Session session = theHibernateUtility.getCurrentSession();
        Transaction transaction = session.beginTransaction();
      
        Query allUsersQuery = session.createQuery("select u from User as u order by u.id");
       
        users = allUsersQuery.list();
        System.out.println("num users: "+users.size());
       
        Iterator<User> iter = users.iterator();;
        while(iter.hasNext()) {
            User element = iter.next();
            System.out.println(element.toString());
            System.out.println("num of phone numbers: "+element.getPhoneNumbers().size());
        }
        transaction.commit();
    }
    private void modifyUser() {

        Session session = theHibernateUtility.getCurrentSession();
        Transaction transaction = session.beginTransaction();
  
        Query singleUserQuery = session.createQuery("select u from User as u where u.uname='lee'");
        User leeUser = (User)singleUserQuery.uniqueResult();
     
        leeUser.setUname("justice");
       
        session.merge(leeUser);

        transaction.commit();
     
        showAllUsers();
    }

    private void addSharedPhoneNumber() {
        Session session = theHibernateUtility.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        
        Query justiceQuery = session.createQuery("select u from User as u where u.uname='justice'");
        User justiceUser = (User)justiceQuery.uniqueResult();

        Query aNameQuery = session.createQuery("select u from User as u where u.uname='aName'");
        User aNameUser = (User)aNameQuery.uniqueResult();
        PhoneNumber sharedPhoneNumber = new PhoneNumber();
        sharedPhoneNumber.setPhone("(546)222-9898");

        Set<PhoneNumber> justicePhoneNumbers = justiceUser.getPhoneNumbers();
        justicePhoneNumbers.add(sharedPhoneNumber);
     
        Set<PhoneNumber> aNamePhoneNumbers = aNameUser.getPhoneNumbers();
        aNamePhoneNumbers.add(sharedPhoneNumber);
       
        session.save(sharedPhoneNumber);
     
        session.merge(justiceUser);
        session.merge(aNameUser);
     
        transaction.commit();
    
        showAllUsers();
    }
    private void deleteAddedUsers() {
        Session session = theHibernateUtility.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        int numUsers = users.size();
        System.out.println("user count: " + numUsers);
        for(int i = 0; i < numUsers; i++){
            System.out.println("deleting user "+users.get(i).getUname());
            session.delete(users.get(i));
        }
        transaction.commit();
   
        System.out.println(users);
        users.clear();
     
        System.out.println(users);
    }
}