package team.services;

import org.springframework.stereotype.Component;
import team.model.Team;

import java.util.List;

@Component
public interface TeamService {
    Team createTeam(final Team team);
    List<Team> getAllTeams();
    Team getTeamById(String id);
}
