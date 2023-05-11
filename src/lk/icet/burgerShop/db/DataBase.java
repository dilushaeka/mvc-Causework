package lk.icet.burgerShop.db;

import lk.icet.burgerShop.model.Customer;
import lk.icet.burgerShop.model.Order;

public class DataBase {
    public static  Customer[] customerArray = new Customer[0] ;

    public static Order[] orderArray = new Order[0];

    public static Customer[] custIcrement(Customer customer){
        try {
            Customer[] temp=new Customer[customerArray.length+1];
            System.arraycopy(customerArray,0,temp,0,customerArray.length);
            customerArray=temp;
            customerArray[customerArray.length-1]= customer;
            return customerArray;
        }catch (Exception e){
            e.printStackTrace();
        }
       return null;
    }


    public static Order[] orderIncrement(Order order){
      try {
          Order[] temp=new Order[orderArray.length+1];
          System.arraycopy(orderArray,0,temp,0,orderArray.length);
          orderArray=temp;
          orderArray[customerArray.length-1]= order;
          return orderArray;
      }catch (Exception e){
          e.printStackTrace();
      }
      return null;
    }


//    public static boolean addingDataBase(Customer cust) {
//        Object[] object=
//    }
}
