package message;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static  org.mockito.Mockito.*;

class NotificationServiceTest {

    @Test
    void testMessageSend(){
        MessageService messageService = mock(MessageService.class);
        NotificationService notificationService = new NotificationService(messageService);
        notificationService.sendNotification("test", "user");
        verify(messageService,times(1)).sendMessage("test", "user");

    }

}