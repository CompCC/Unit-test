package database;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;
import static  org.mockito.Mockito.*;


class DataProcessorTest {
    @Test
    void testDataBase(){
        Database database = mock(Database.class);
        when(database.query(anyString())).thenReturn(Arrays.asList("test1", "test2", "test3"));
        DataProcessor dataProcessor = new DataProcessor(database);
        assertThat(dataProcessor.processData("SELECT * FROM users WHERE username LIKE '%test%'").size()).isEqualTo(3);
    }

}