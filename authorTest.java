public class authorTest {
    public static Author[] newAuthors() {
        Author[] authors = new Author[3];
        authors[0] = new Author("tg1", "jane@example.com", Gender.M);
        authors[1] = new Author("tg2", "emily@example.com",Gender.F);
        authors[2] = new Author("tg3", "sophia@example.com", Gender.M);

        return authors;
    }
    }
