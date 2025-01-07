package lab8.doubly;

class Book {
    int bookID;
    String bookTitle;
    Book prev;
    Book next;

    Book(int bookID, String bookTitle) {
        this.bookID = bookID;
        this.bookTitle = bookTitle;
        this.prev = null;
        this.next = null;
    }
}
class LibraryDoublyLinkedList {
    private Book head;

    public void insertAtBeginning(int bookID, String bookTitle) {
        Book newBook = new Book(bookID, bookTitle);
        if (head == null) {
            head = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
        System.out.println("Book added: " + bookTitle);
    }
    public void displayBooks() {
        if (head == null) {
            System.out.println("The library is empty.");
            return;
        }
        System.out.println("Books in the library:");
        Book temp = head;
        while (temp != null) {
            System.out.println("Book ID: " + temp.bookID + ", Title: " + temp.bookTitle);
            temp = temp.next;
        }
    }
    public void deleteBookByID(int bookID) {
        if (head == null) {
            System.out.println("The library is empty. No book to delete.");
            return;
        }
        Book temp = head;
        while (temp != null && temp.bookID != bookID) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Book with ID " + bookID + " not found.");
            return;
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        } else {
            head = temp.next;
        }
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
        System.out.println("Book with ID " + bookID + " has been deleted.");
    }
}
class LibraryManagement {
    public static void main(String[] args) {
        LibraryDoublyLinkedList library = new LibraryDoublyLinkedList();

        library.insertAtBeginning(101, "Wuthering Heights");
        library.insertAtBeginning(102, "Rich Dad Poor Dad");
        library.insertAtBeginning(103, "How to make 12m$");
        library.displayBooks();
        library.deleteBookByID(102);
        library.displayBooks();
    }
}
