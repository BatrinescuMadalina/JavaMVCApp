package ro.teamnet.zth.api.annotations;

import ro.teamnet.zth.app.Controller.EmployeeController;

import java.lang.annotation.*;

/**
 * Created by user on 5/6/2015.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyController {
    String urlPath();
}
