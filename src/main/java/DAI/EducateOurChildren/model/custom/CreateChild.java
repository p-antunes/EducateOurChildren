package DAI.EducateOurChildren.model.custom;

import DAI.EducateOurChildren.model.role;
import DAI.EducateOurChildren.util.ConstantUtil;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class CreateChild {

    @NotBlank(message = "Can't be blank")
    @Pattern(regexp = ConstantUtil.CHAR_PATTERN, message = "Can only letters, letters with special characters and spaces")
    private String name;

    @Email(message = "Insert a valid email")
    private String email;

    private role role;

    @Pattern(regexp = ConstantUtil.PASSWORD_PATTERN, message = "Needs at least 1 UpperCase, 1 LowerCase and 1 Number", @Pattern(regexp = ConstantUtil.PASSWORD_PATTERN, message = "Needs at least 1 UpperCase, 1 LowerCase and 1 Number") String password, @Pattern(regexp = ConstantUtil.PASSWORD_PATTERN, @Pattern(regexp = ConstantUtil.CHAR_PATTERN, message = "Can only letters, letters with special characters and spaces") String name,  @Pattern(regexp = ConstantUtil.CHAR_PATTERN){
    this.name = name;
    this.role = role;
    }
    public String () {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public role getRole() {
        return role;
    }


}
