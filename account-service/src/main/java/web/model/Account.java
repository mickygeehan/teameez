package web.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.data.annotation.Id;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"id", "firstName", "lastName"})
public class Account {

    @Id
    private String id;

    private String firstName;

    private String lastName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
