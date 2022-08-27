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
  
Printing data using Iterable

import java.util.Iterator;
public class BookList<Book> implements Iterable<Book> {
    public Iterator<Book> iterator() {...}
}

Iterator<Book> bookIterator = bookList.iterator();
while (bookIterator.hasNext()) {
  System.out.println(bookIterator.next());
}
// Iterable is dependent on iterator;    
or:

for (Book book : bookList) {
    System.out.println(book);
}
// Iterator is independent of iterable.   

List<String> structures = new ArrayList<>();
structures.add("BST");
structures.add("HashMap");
structures.add("Graph");

// simple for each loop that iterates through the ArrayList "structures"
for (String structure: structures) {
    System.out.println("I love " + structure + "s!");
}

List<String> foods = new LinkedList<>();
foods.add("pasta");
foods.add("pizza");
foods.add("soup");

// this for-each loop is more efficient...
for (String food: foods) {
    System.out.println("I love eating " + food + "!");
}

// ...rather than this regular for loop
for (int i = 0; i < foods.size(); i++) {
    String food = foods.get(i); // this line requires Java to internally iterate through a portion of the linkedlist again
    System.out.println("I love eating " + food + "!");
}








