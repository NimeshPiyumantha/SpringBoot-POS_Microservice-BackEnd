package lk.ijse.customerservice.dto;

/**
 * @author : Nimesh Piyumantha
 * @PACKAGE_NAME : lk.ijse.customerservice.dto
 * @PROJECT_NAME : SpringBoot-POS_Microservice-BackEnd
 * @Date : 5/24/2023
 * @Time : 4:12 PM
 * @since : 0.1.0
 **/
public class CustomDTO {
    private String value;
    private int count;

    public CustomDTO(String lastIndex) {
        this.value=lastIndex;
    }

    public CustomDTO(int count) {
        this.count=count;
    }
}
