package carroll.tbel.project2.models.form;

import carroll.tbel.project2.entities.User;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;

@EqualsAndHashCode
@ToString
@Getter @Setter
@Validated
public class UserCreateForm {

    @Length(min = 3, max = 12)
    private String username;
    @Length(min = 0, max = 20)
    private String password;

}
