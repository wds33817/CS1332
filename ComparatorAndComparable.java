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
