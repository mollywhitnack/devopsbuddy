package com.devopsbuddy.web.i18n;

import org.springframework.context.MessageSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;
import java.util.Locale;

/**
 * Created by mollywhitnack on 3/14/17.
 */
@Service
public class I18NService {

    private MessageSource messageSource;


    /**
     * Returns  message for the given id and the default locale in the session context
     * @param messageId The key to the messages resource file
     */
    public String getMessage(String messageId){
        Locale locale = LocaleContextHolder.getLocale();
        return getMessage(messageId, locale);
    }

    /**
     * Returns  message for the given id and locale
     * @param messageId The key to the messages resource file
     * @param locale The Locale
     */
    public String getMessage(String messageId, Locale locale){
        return messageSource.getMessage(messageId, null, locale);
    }
}
