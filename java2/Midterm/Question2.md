## Question (2)

Write the definition of a class named **BookInventory** that includes the following private members:

- **capacity**: an integer representing the maximum number of books.
- **Titles**: an array of type String representing the titles of books.
- **noCopies**: an array of type integer to hold the number of copies for each book in the Titles array.
- **numItems**: an integer to represent the actual number of books saved in the Titles array.

*Note*: Titles and noCopies are parallel arrays, thus for a given book in *Titles[i]*, the number of copies of this book is saved in *noCopies[i]*.

Additionally, the class should include the following public methods:

1. A **constructor** with an integer parameter (**maxNo**). The constructor should initialize **numItems** to zero, set the value of **capacity** to maxNo and create Titles and noCopies as arrays of size capacity.
2. A method named **findBookIndex** that accepts string (T) as parameter. The method should return the index of the book of Title (T). If the book is not found, the method should return –1.
3. A method named **addItem** that accepts two parameters: *T* as String and *C* as integer. The method should add (T) and (C) to the end of the Titles and noCopies arrays, respectively, and increment numItems. The addition should be performed if the array is not full and if (T) is unique (i.e. T is not already found in the Titles array).
4. A method named **outOfStock** to print the titles of books with no copies (i.e. noCopies is zero).
