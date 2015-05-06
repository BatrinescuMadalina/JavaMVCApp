package ro.teamnet.zth.api.annotations;

import java.lang.annotation.*;

/**
 * Created by user on 5/6/2015.
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyRequestMethod {
    String methodType();
    String urlPath();
}
