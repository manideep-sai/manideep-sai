package com.aryan.mts.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.aryan.mts.beans.ErrorMapper;

import jakarta.servlet.http.HttpServletRequest;

public class DefaultExceptionHandler {
	
	@ResponseBody
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	@ExceptionHandler({ Exception.class })
	public ErrorMapper handleConflict(Exception e, HttpServletRequest request) {
		String msg = e.getMessage();
		String uri = request.getRequestURL().toString();
		return new ErrorMapper(uri, msg, new Date());
	}
	
}
