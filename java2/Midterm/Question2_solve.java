public class BookInventory {

    private int maxCapacity;
    private String[] titles;
    private int[] copies;
    private int noCopies;


    public BookInventory(int C) {
        noCopies = 0;
        int capacity = maxCapacity;
        titles = new String[maxCapacity];
        copies = new int[maxCapacity];
    }


    public void addBook(String T, int C) {
        int index = findBookIndex(T);
        if (noCopies == titles.length)
            System.out.println("Sorry, the array is full");
        if (index == -1)
            System.out.println("This Book is already in the list");
        else {
            titles[noCopies] = T;
            copies[noCopies] = C;
            noCopies++;

        }

    }

    private int findBookIndex(String T) {
        for (int i = 0; i < noCopies; i++) {
            if (titles[i].equalsIgnoreCase(T))
                return i; // 1 pt

        }
        return -1;
    }


    public void outOfStock() {
        for (int i = 0; i < titles.length; i++) {
            if (copies[i] == 0)
                System.out.println(titles[i]);
        }

    }
}
