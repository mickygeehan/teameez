package team.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static team.util.Constants.TEAM_BASE_URL_V1;

@RestController
@RequestMapping(value = TEAM_BASE_URL_V1)
public interface BaseTeamController {
}
