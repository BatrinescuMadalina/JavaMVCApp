package ro.teamnet.zth.app.Controller;

import ro.teamnet.zth.api.annotations.MyController;
import ro.teamnet.zth.api.annotations.MyRequestMethod;

/**
 * Created by user on 5/6/2015.
 */
@MyController(urlPath = "/departments")
public class DepartmentController {
    @MyRequestMethod(methodType = "GET",urlPath = "/all")
    public String getAllDepartments(){
        return "allDepartments";
    }
    @MyRequestMethod(methodType ="GET",urlPath = "/one")
    public String getOneDepartment(){
        return "oneRandomDepartment";

    }
}
