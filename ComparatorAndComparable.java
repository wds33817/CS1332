An object can use compareTo method to compare,

An object from a comparable class can compare itself to another object using the compareTo method. 

public int compareTo(T y);  // natural ordering 

x.compareTo(y)          ->           Negative: x < y
                                     Zero:     x = y
                                     Positive: x > y
          
          
          
Comparator Interface
Use a comparator to compare two objects of the same type using the compare method
public int compare(T x, T y);
comp.compare(x, y)        ->         Negative: x < y
                                     Zero:     x = y
                                     Positive: x > y
                                     
                                     
e.g.   1:
public class HDTV implements Comparable<HDTV> {  // Comparable interface is in java.lang package, so no need to import
    private int size;
    private String brand;
    public int getSize() { return size; }
    public String getBrand() { return brand; }
    
    public int compareTo(HDTV tv) {
        if (size < tv.size) { return -1; }
        else if (size > tv.size) { return 1; }
        else { return 0; }
    }
    // or implement like this:
    public int compareTo(HDTV tv) {
        return size - tv.size;
    }
}


e.g.    2:
import java.util.Comparator;
public class HDTV {
    private int size;
    private String brand;
    public int getSize() { return size; }
    public String getBrand() { return brand; }
}
class SizeComparator implements Comparator<HDTV> {
    public int compare (HDTV tv1, HDTV tv2) {
        return tv1.getSize() - tv2.getSize();
    }
}


public class MenuItem implements Comparable<MenuItem> {
    private String name;
    private int price;

    public MenuItem(String name, int price) { ... }

    public int compareTo(MenuItem otherItem) {
        return this.price - otherItem.getPrice();
    }
}


MenuItem item1 = new MenuItem("cheesesteak", 4);
MenuItem item2 = new MenuItem("cheesecake", 7);

// we should compare these items like this:
if (item1.compareTo(item2) < 0) {
    ...
}

// this DOES NOT work:
if (item1 < item2) {
    ...
}

// this works properly
if (item1.compareTo(item2) < 0) {
    System.out.println(item1.name + " is cheaper than " + item2.name);
} else if (item1.compareTo(item2) > 0) {
    System.out.println(item1.name + " is more expensive than " + item2.name);
} else {
    System.out.println(item1.name + " and " + item2.name + " are the same price!");
}

// this does NOT work properly: (item2.price - item1.price) is 3, so the first two conditions are false
if (item1.compareTo(item2) == -1) {
    System.out.println(item1.name + " is cheaper than " + item2.name);
} else if (item1.compareTo(item2) == 1) {
    System.out.println(item1.name + " is more expensive than " + item2.name);
} else {
    System.out.println(item1.name + " and " + item2.name + " are the same price!");
}


asymptotic notation  渐进式符号

Big-O a measure of how performance scales as the input grows towards infinity.
Big-O is a theoretical measure of worst-case behavior of algorithm performance. 
It's used so that we can avoid smaller details like low-level system instructions and hardware / platform differences. 
This gives us a simple way of modeling efficiency, but it results in loss of detail and direct practical applicability.

  
  
High level:
Primitive operations:
Assign value
Arithmetic operation
Comparing two entities
Method call or return from method
Access element or follow a reference

Primitive operations execute in constant time
Count the operations
f(n) operations on an input of size n, 3 cases:
worst case - the algo running on worst set of data, worst performance
best case - the algo running on best set of data, fastest performance
average case - somewhere between and difficult to compute

O(2^n), O(n^3)
  
O(nlog(n)), O(n), O(log(n)), O(1)   // these are acceptable.

Big-O conventions:
Drop constant factors:
O(5n) -> O(n)






