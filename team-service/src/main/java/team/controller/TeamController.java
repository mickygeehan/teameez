package team.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import team.model.Team;
import team.services.TeamService;

@RestController
public class TeamController implements BaseTeamController {

    private static final Logger LOG = LoggerFactory.getLogger(TeamController.class);

    @Autowired
    private TeamService teamService;

    @PostMapping(path = "teams", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> createAccount(@RequestBody(required = true) final Team team) {
        LOG.info("createTeam() request: {}", team);
        return new ResponseEntity<>(teamService.createTeam(team), HttpStatus.CREATED);
    }

    @GetMapping(path = "teams", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getAccounts() {
        LOG.info("getAllTeams() request received");
        return new ResponseEntity<>(teamService.getAllTeams(), HttpStatus.OK);
    }

    @GetMapping(path = "accounts/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getAccountDetails(@PathVariable String id) {
        LOG.info("getTeamDetails() request: {}", id);
        return new ResponseEntity<>(teamService.getTeamById(id), HttpStatus.OK);
    }

}
