package it.bz.opendatahub.webcomponents.dataservice.exception.controller;

import io.swagger.v3.oas.annotations.Hidden;
import it.bz.opendatahub.webcomponents.dataservice.exception.ErrorMessage;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Hidden
@Controller
public class CustomErrorController extends ExceptionHandlerController implements ErrorController {

    private static final String PATH = "/error";

    @Override
    public String getErrorPath() {
        return PATH;
    }

    @GetMapping(value=PATH, produces="application/json")
    @ResponseBody
    public ResponseEntity<ErrorMessage> handleGet(HttpServletRequest request) {
        return handleRequest(request);
    }

	@PatchMapping(value=PATH, produces="application/json")
	@ResponseBody
	public ResponseEntity<ErrorMessage> handlePatch(HttpServletRequest request) {
		return handleRequest(request);
	}

	@PutMapping(value=PATH, produces="application/json")
	@ResponseBody
	public ResponseEntity<ErrorMessage> handlePut(HttpServletRequest request) {
		return handleRequest(request);
	}

    @PostMapping(value=PATH, produces="application/json")
    @ResponseBody
    public ResponseEntity<ErrorMessage> handlePost(HttpServletRequest request) {
        return handleRequest(request);
    }

    private ResponseEntity<ErrorMessage> handleRequest(HttpServletRequest request) {
        Integer code = (Integer)request.getAttribute("javax.servlet.error.status_code");
        String text = String.valueOf(request.getAttribute("javax.servlet.error.message"));

        ErrorMessage message = new ErrorMessage();
        message.setErrorCode(code);
        message.setMessage(text);

        return new ResponseEntity<>(message, HttpStatus.valueOf(code));
    }
}
