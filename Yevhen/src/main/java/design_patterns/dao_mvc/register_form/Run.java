package design_patterns.dao_mvc.register_form;

import design_patterns.dao_mvc.register_form.controller.UserConsoleController;
import design_patterns.dao_mvc.register_form.dao.UserFileDao;
import design_patterns.dao_mvc.register_form.dao.UserJvmDao;

/**
 * Created by gorobec on 11.06.17.
 */
public class Run {
    public static void main(String[] args) {
        UserConsoleController consoleController =
                new UserConsoleController(new UserFileDao());

        while (true) {
            consoleController.startApp();
        }

    }
}
