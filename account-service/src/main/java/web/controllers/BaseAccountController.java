package web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static web.util.Constants.ACCOUNT_BASE_URL_V1;

@RestController
@RequestMapping(value = ACCOUNT_BASE_URL_V1)
public interface BaseAccountController {
}
