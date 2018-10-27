package cn.itcast.test;

import cn.itcast.domain.Customer;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPADemo1 {
 @Test
 public void fun1(){
  EntityManagerFactory factory = Persistence.createEntityManagerFactory("myJpa");
  EntityManager entityManager = factory.createEntityManager();
  EntityTransaction transaction = entityManager.getTransaction();
  transaction.begin();
  Customer customer = new Customer();
  customer.setCustName("张三");
  customer.setCustAddress("北京");
  customer.setCustIndustry("旅游");
  customer.setCustLevel("vip");
  customer.setCustPhone("13600132258");
  customer.setCustSource("网络");
  entityManager.persist(customer);
  transaction.commit();
  entityManager.close();
  factory.close();
 }
}