package thymeleafstudy.thymeleaf.form.domain.item;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DeliveryCode {

    private String code;
    private String displayName;

}
