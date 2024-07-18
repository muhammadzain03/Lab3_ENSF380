package ca.ucalgary.ensf380;

public class Mybook {
    public static void main(String[] args) {
        // Create some Author objects
        Author author1 = new Author("George Orwell", "London", 46);
        Author author2 = new Author("Aldous Huxley", "California", 69);
        Author author3 = new Author("J.K. Rowling", "Edinburgh", 55);

        // Create some Publisher objects
        Publisher publisher1 = new Publisher("Penguin Books", "New York");
        Publisher publisher2 = new Publisher("HarperCollins", "London");

        // Create some Book objects
        Hardcover book1 = new Hardcover();
        book1.setIsbn("978-0451524935");
        book1.setPages(328);
        book1.setPublicationYear(1949);
        
        Paperback book2 = new Paperback();
        book2.setIsbn("978-0060850524");
        book2.setPages(268);
        book2.setPublicationYear(1932);
        
        Fiction book3 = new Fiction();
        book3.setIsbn("978-0747532699");
        book3.setPages(223);
        book3.setPublicationYear(1997);

        // Create Classic and Novel objects
        Classic classic1 = new Classic();
        classic1.setOrigPubYear(1860);
        classic1.setTheAuthor(author1);
        classic1.setBookPublisher(new Publisher[]{publisher1});
        
        Novel novel1 = new Novel();
        novel1.setTheAuthor(new Author[]{author3});
        Series series1 = new Series("Harry Potter Series");
        novel1.setMySeries(series1);

        // Create Anthology object
        Story story1 = new Story();
        story1.setTheAuthor(new Author[]{author2});
        
        Anthology anthology1 = new Anthology();
        anthology1.setStory(new Story[]{story1});

        // Print information about the books with spacing and dashed lines
        System.out.println("");
        System.out.println("Book 1:");
        System.out.println("ISBN: " + book1.getIsbn());
        System.out.println("Pages: " + book1.getPages());
        System.out.println("Publication Year: " + book1.getPublicationYear());
        System.out.println("----");

        System.out.println("Book 2:");
        System.out.println("ISBN: " + book2.getIsbn());
        System.out.println("Pages: " + book2.getPages());
        System.out.println("Publication Year: " + book2.getPublicationYear());
        System.out.println("----");

        System.out.println("Book 3:");
        System.out.println("ISBN: " + book3.getIsbn());
        System.out.println("Pages: " + book3.getPages());
        System.out.println("Publication Year: " + book3.getPublicationYear());
        System.out.println("----");

        // Print information about the Classic book
        System.out.println("Classic Book:");
        System.out.println("Original Publication Year: " + classic1.getOrigPubYear());
        System.out.println("Author: " + classic1.getTheAuthor().getName());
        System.out.println("Publisher: " + classic1.getBookPublisher()[0].getName());
        System.out.println("----");

        // Print information about the Novel
        System.out.println("Novel:");
        System.out.println("Author: " + novel1.getTheAuthor()[0].getName());
        if (novel1.getMySeries() != null) {
            System.out.println("Series: " + novel1.getMySeries().getSeriesName());
        } else {
            System.out.println("Series: Standalone");
        }
        System.out.println("----");

        // Print information about the Anthology
        System.out.println("Anthology:");
        System.out.println("Story Author: " + anthology1.getStory()[0].getTheAuthor()[0].getName());
        System.out.println("----");
    }
}
