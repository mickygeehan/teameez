package team.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.data.annotation.Id;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"id", "ownerAccountId", "name"})
public class Team {

    @Id
    private String id;

    private String ownerAccountId;

    private String name;

    private List<Account> playerAccounts;

    public List<Account> getPlayerAccounts() {
        return playerAccounts;
    }

    public void setPlayerAccounts(List<Account> playerAccounts) {
        this.playerAccounts = playerAccounts;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwnerAccountId() {
        return ownerAccountId;
    }

    public void setOwnerAccountId(String ownerAccountId) {
        this.ownerAccountId = ownerAccountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
