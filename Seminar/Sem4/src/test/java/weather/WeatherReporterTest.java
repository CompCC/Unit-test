package weather;


import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static  org.mockito.Mockito.*;

class WeatherReporterTest {
    @Test
    void testReporter(){
        WeatherService weatherService = mock(WeatherService.class);
        when(weatherService.getCurrentTemperature()).thenReturn(23);

        WeatherReporter weatherReporter = new WeatherReporter(weatherService);
        assertThat(weatherReporter.generateReport()).isEqualTo("Текущая температура: 23 градусов.");
    }


}