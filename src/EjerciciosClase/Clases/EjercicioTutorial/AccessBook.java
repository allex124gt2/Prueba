package EjerciciosClase.Clases.EjercicioTutorial;

public class AccessBook {
    public static void main(String[] args) {
        BookDao bookDao = new BookDaoImpl();

        for (Books book : bookDao.getAllBooks() ){
            System.out.println("Name BOOKNAME : " +book.getBookName());
        }

        for (Books book : bookDao.getAllBooks()){
            System.out.println("Book ISBN : " + book.getIsbn());

        }
        //update student
        Books book = bookDao.getAllBooks().get(1);
        book.setBookName("Algorithms");
        bookDao.saveBook(book);
    }
}
