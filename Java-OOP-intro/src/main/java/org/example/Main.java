package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Product product = new Product();
        product.setId(1);
        product.setProductName("Kahve Makinası") ;
        product.setUnitPrice(1299.00);
        product.setUnitInStock(100);
        product.setImgUrl(  "Ww....sdfsfgdsfgdsf /*dafsdgsfsdf*dsf/sda");

        System.out.println(product.getId() + " " + product.getProductName() + " " + product.getUnitPrice());
        //---------------------------------------------------------------

        Product product2 = new Product();
        product2.setId(2);
        product2.setProductName("Çamaşır makinesi") ;
        product2.setUnitPrice(1299.00);
        product2.setUnitInStock(100);
        product2.setImgUrl(  "Ww....sdfsfgdsfgdsf /*dafsdgsfsdf*dsf/sda");


        Product[ ] products = {product ,product2};
        System.out.println("<ul>");
        for (Product pr : products  ) {

            System.out.println("<li> " + pr.getProductName()+ " </li>");
        }
        System.out.println("</ul>");


        IndividualCustomer individualCustomer = new IndividualCustomer();

        individualCustomer.setId(1);
        individualCustomer.setName("Turkcell");
        individualCustomer.setPhone("05467897451");
       

        System.out.println(individualCustomer.getId() + " " + individualCustomer.getName() +  " " + individualCustomer.getPhone() + " " );



    }
}