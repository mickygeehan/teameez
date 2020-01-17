package team.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.dao.TeamRepository;
import team.model.Team;

import java.nio.file.FileSystemNotFoundException;
import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamRepository teamRepository;

    @Override
    public Team createTeam(Team team) {
        return teamRepository.save(team);
    }

    @Override
    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }

    @Override
    public Team getTeamById(String id) {
        return teamRepository.findById(id).orElseThrow(() -> new FileSystemNotFoundException());
    }
}
