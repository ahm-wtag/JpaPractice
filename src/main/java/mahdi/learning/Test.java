package mahdi.learning;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {
    public static void main(String[] args) {
        long startTime;
        long stopTime;

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerService service = context.getBean(CustomerService.class);
        service.addCustomer();
//        service.updateCustomer();
//
//        FullTimeEmployee e1 = new FullTimeEmployee();
//        PartTimeEmployee e2 = new PartTimeEmployee();
//        e1.setName("mahdi");
//        e1.setSalary(111);
//
//        e2.setName("sdasd");
//        e2.setPph(1212);
//
//        EmployeeDao employeeDao = context.getBean(EmployeeDao.class);
//
//        startTime = System.currentTimeMillis();
        service.viewCustomer();
//        employeeDao.persist(e1);
//        employeeDao.persist(e2);
//        stopTime = System.currentTimeMillis();
//        System.out.println("Elapsed time = "+(stopTime-startTime)+" msecs.");
    }
}
