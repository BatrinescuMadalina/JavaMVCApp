package ro.teamnet.zth.app.Controller;

import ro.teamnet.zth.api.annotations.MyController;
import ro.teamnet.zth.api.annotations.MyRequestMethod;
import ro.teamnet.zth.app.domain.Employee;

/**
 * Created by user on 5/6/2015.
 */
@MyController(urlPath = "/employees")
public class EmployeeController {
    @MyRequestMethod(methodType = "GET",urlPath = "/all")
    public String getAllEmployees(){
        return "allEmployees";
    }
    @MyRequestMethod(methodType ="GET",urlPath = "/one")
   public String getOneEmployee(){
      return "oneRandomEmployee";

   }
}
