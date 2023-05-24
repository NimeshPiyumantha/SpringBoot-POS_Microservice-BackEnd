package lk.ijse.customerservice.exception;

/**
 * @author : Nimesh Piyumantha
 * @PACKAGE_NAME : lk.ijse.customerservice.exception
 * @PROJECT_NAME : SpringBoot-POS_Microservice-BackEnd
 * @Date : 5/24/2023
 * @Time : 3:59 PM
 * @since : 0.1.0
 **/
public class ValidationException extends RuntimeException{
    public ValidationException(String message) {
        super(message);
    }
}
