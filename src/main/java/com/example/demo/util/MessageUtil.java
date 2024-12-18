package com.example.demo.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class MessageUtil {
	
	@Autowired
	private MessageSource messageSource;
	
	public String getMessage(String resultCode) {
		return messageSource.getMessage(resultCode, null, LocaleContextHolder.getLocale());
	}
	
	public String getMessage(String resultCode, String[] args) {
		return messageSource.getMessage(resultCode, args, LocaleContextHolder.getLocale());
	}
	
	public String getMessage(String resultCode, String[] args, Locale locale) {
		return messageSource.getMessage(resultCode, args, locale);
	}

}
