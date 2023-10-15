package flat.company.project;

import java.util.Arrays;

// com.company.project.lesson07.Book
public class Book {
    // модификатор private - свойство, конструктор, метод доступны только в текущем классе
    private String name; // значение по умолчанию null (как и для всех ссылочных типов)
    private boolean isPublished; // // значение по умолчанию false (для типа boolean)
    // хранит ссылки на нескольких авторов
    private Author[] authors;

    // ПКМ -> Generate -> Constructor
    // numberOfAuthors - размер массива authors
    // значение numberOfAuthors должно находиться в диапазоне [1, 5)
    public Book(String name, int numberOfAuthors) {
        setName(name); // вызов метода внутри класса
        setArr(numberOfAuthors);
    }

    // ПКМ -> Generate -> Setter
    public void setName(String name) { // Setter
        // if (name == null) return;
        if (name == null) { // если значение name равно null
            // будет выброшено исключение, программа завершит выполнение с ошибкой
            throw new IllegalArgumentException("name not null");
        }
        this.name = name;
    }

    public void setArr(int numberOfAuthors) {
        if (numberOfAuthors >= 1 && numberOfAuthors <= 5) {
            authors = new Author[numberOfAuthors];
            Arrays.fill(authors,null);
        }
    }

    // ПКМ -> Generate -> Getter
    public String getName() { // Getter
        return name;
    }
    // ПКМ -> Generate -> Setter and Getter

    // метод добавления нового автора в массив authors
    public void addAddAuthor(Author author) {
        // author не может быть null ссылкой
        // новые авторы не должны перезаписывать уже существующих в массиве
        if (author != null) {
            for (int el = 0; el < authors.length; el++) {
                if(author.equals(authors[el])) break;
                if (authors[el] == null) {
                    authors[el] = author;
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        Author author01 = new Author(1,"Artemii");
        Author author02 = new Author(1,"Artemii");
        Book book = new Book("about",3);
        book.addAddAuthor(author01);
        book.addAddAuthor(author02);
        System.out.println();
    }
}
