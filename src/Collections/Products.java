package Collections;



import java.util.*;

public class Products {
    public static void main(String[] args) {
        List<Integer> products = new Vector<>();
        products.add(1);
        products.add(2);
        products.add(3);
        products.add(4);
        products.add(5);
        products.add(5);
        System.out.println(products);

//        Iterator itr = products.iterator();  //getting the Iterator
//        while (itr.hasNext()) {   //check if iterator has the elements
//            System.out.println(itr.next());
//        }
        for(Integer product:products)
            System.out.println(product);
    }
}
