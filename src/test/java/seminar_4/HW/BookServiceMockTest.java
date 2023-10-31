package seminar_4.HW;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.*;

public class BookServiceMockTest {

        // Создаем мок-объект BookRepository
        BookRepository mockBookRepository = mock(BookRepository.class);
        // Создаем экземпляр BookService, передавая мок-объект
        BookService service = new BookService(mockBookRepository);


    @Test
    public void testFindBookById() {
        // Устанавливаем, что при вызове findById должен вернуться объект книги
        when(mockBookRepository.findById(anyString())).thenReturn(new Book("1", "Book1", "Author1"));
        // Вызываем метод findBookById
        Book result = service.findBookById("2");

        // Проверяем, что метод findBookById был вызван ровно один раз с любым Id
        verify(mockBookRepository, times(1)).findById(anyString());

        // Проверяем результат, который должен быть new Book("1", "Book1", "Author1")
        assertThat(result);
    }

    @Test
    public void testFindAllBooks() {
        // Устанавливаем, что при вызове findAll должен вернуться пустой список
        when(mockBookRepository.findAll()).thenReturn(new ArrayList<>());

        // Вызываем метод findAllBooks
        List<Book> result = service.findAllBooks();

        // Проверяем, что метод findBookById был вызван ровно один раз
        verify(mockBookRepository, times(1)).findAll();

        // Проверяем результат, который должен быть пустым списком
        assertThat(result);
    }

}
