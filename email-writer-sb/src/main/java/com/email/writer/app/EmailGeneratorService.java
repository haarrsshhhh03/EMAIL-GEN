package com.email.writer.app;

import org.springframework.stereotype.Service;

@Service
public class EmailGeneratorService {
    public String generateEmailREply(EmailRequest emailRequest){

        //Building the promt
        String prompt =buildprompt(emailRequest);

        //Craft a request ---> folow the json like format

        //do request and get response

    }

    private String buildprompt(EmailRequest emailRequest) {
        StringBuilder prompt = new StringBuilder();
        prompt.append("generate a proff email reply to the following mail. please dont reply");
        if(emailRequest.getTone()!= null && !emailRequest.getTone().isEmpty()){
            prompt.append("use a ").append(emailRequest.getTone()).append("tone.");
        }
        prompt.append("\n Original email: \n").append(emailRequest.getEmailContent());

        return prompt.toString();
    }
}
