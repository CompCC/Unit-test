package book;
/**
 * У вас есть класс BookService, который использует интерфейс BookRepository для получения информации о книгах из базы данных.
 * Ваша задача написать unit-тесты для BookService, используя Mockito для создания мок-объекта BookRepository.
 */

import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

class BookServiceTest {
    @Test
    void testBookRepo() {
        BookRepository bookRepository = mock(BookRepository.class);
        when(bookRepository.findById(anyString())).thenReturn((Book) Arrays.asList("1", "BookTest", "AutorTest"));
        when(bookRepository.findAll()).thenReturn(new ArrayList<>(List.of()));
        BookService bookService = new BookService(bookRepository);
        assertThat(bookService.findBookById("1")).isEqualTo("1");

    }
}