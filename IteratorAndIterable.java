import java.util.Iterator;

public class BookList<Book> implements Iterator<Book> {
    public void next() {...}
    public boolean hasNext() {...}
}

//Assuming we have a BookList object called bookList:
while (bookList.hasNext()) {
    System.out.println(bookList.next());
}

Iterable interface has an abstract method called iterator() that returns an Iterator object to handle traversing the data structure.
Belongs to java.lang package.
  
