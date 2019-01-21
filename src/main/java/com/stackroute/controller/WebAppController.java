
package com.stackroute.controller;

        import com.stackroute.Customers;
        import com.stackroute.config.WebAppConfig;
        import com.stackroute.dao.DaoImplementation;
        import org.springframework.context.ApplicationContext;
        import org.springframework.context.annotation.AnnotationConfigApplicationContext;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestParam;
        import org.springframework.web.servlet.ModelAndView;

        import java.util.List;


@Controller
public class WebAppController {

    @RequestMapping(value = "/")
    public String homePage(){
        return "homePage"; // View Name
    }

    @RequestMapping(value = "/event_page")
    public ModelAndView populateCustomer(@RequestParam("userName") String userName, @RequestParam("givenPassword") String password){
        Customers customer= new Customers();
        customer.setPassword(password);
        customer.setUserName(userName);

        DaoImplementation daoImplementation = new DaoImplementation();
        daoImplementation.InsertIntoCustomers(new Customers(customer.getUserName(),customer.getPassword()));
        daoImplementation.InsertIntoCustomers(customer);
        ModelAndView modelAndView= new ModelAndView();
        modelAndView.setViewName("eventPage");
        modelAndView.addObject("objectName",customer.getUserName());
        return modelAndView;
    }
}
