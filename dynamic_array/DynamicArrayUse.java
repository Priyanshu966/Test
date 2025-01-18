package dynamic_array;

import javax.sql.rowset.spi.SyncResolver;

public class DynamicArrayUse {
    public static void main(String args[]){
        DynamicArray d = new DynamicArray();
      
        d.add(8,1000);
        d.add(7,500);
        d.add(8,200);

        d.print();
        System.out.println("Size of array is " + d.size());





    }


    
}
