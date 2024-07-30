import java.util.Arrays;
import java.util.Comparator;

public class LibraryManagement {
    private Book[] books;
    private int count;

    public LibraryManagement(int size) {
        books = new Book[size];
        count = 0;
    }

    // Add a book to the array
    public void addBook(Book book) {
        if (count < books.length) {
            books[count++] = book;
        } else {
            System.out.println("Array is full. Cannot add more books.");
        }
    }

    // Linear search to find a book by title
    public Book linearSearchByTitle(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    // Binary search to find a book by title (assumes the list is sorted)
    public Book binarySearchByTitle(String title) {
        Arrays.sort(books, 0, count, Comparator.comparing(Book::getTitle));
        int left = 0;
        int right = count - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int result = title.compareToIgnoreCase(books[mid].getTitle());

            // Check if title is present at mid
            if (result == 0) {
                return books[mid];
            }

            // If title is greater, ignore left half
            if (result > 0) {
                left = mid + 1;
            }
            // If title is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }
        return null;
    }

    // Traverse and display all books
    public void traverseBooks() {
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }
}
