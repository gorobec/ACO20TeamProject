package design_patterns.dao_mvc.register_form.controller;

import design_patterns.dao_mvc.register_form.dao.UserDao;
import design_patterns.dao_mvc.register_form.model.User;
import design_patterns.dao_mvc.register_form.view.ConsoleView;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.*;

/**
 * Created by gorobec on 17.06.17.
 */

@RunWith(MockitoJUnitRunner.class)
public class UserConsoleControllerTest {


    @InjectMocks
    private UserConsoleController controller;

    @Mock
    private UserDao userDao;

    @Mock
    private ConsoleView view;


    @Test
    public void test_create_user(){

        when(view.greeting()).thenReturn(1);
        when(view.enterAge()).thenReturn(28);
        when(view.enterName()).thenReturn("Yevhen");
        when(view.enterSurname()).thenReturn("Vorobiei");
        when(view.enterPhoneNumber()).thenReturn("55555");

        User user = new User("Yevhen", "Vorobiei", "55555", 28);

        when(userDao.createUser(eq(user))).thenReturn(true);

        controller.startApp();

        verify(view, times(1)).successfulCreateOperation();
        verify(view, times(0)).unsuccessfulCreateOperation();

    }

    @Test
    public void test_create_user_duplicate(){

        when(view.greeting()).thenReturn(1);
        /*when(view.enterAge()).thenReturn(28);
        when(view.enterName()).thenReturn("Yevhen");
        when(view.enterSurname()).thenReturn("Vorobiei");
        when(view.enterPhoneNumber()).thenReturn("55555");

        User user = new User("Yevhen", "Vorobiei", "55555", 28);*/

        when(userDao.createUser(any(User.class))).thenReturn(false);

        controller.startApp();

        verify(view, times(0)).successfulCreateOperation();
        verify(view, times(1)).unsuccessfulCreateOperation();

    }
}
