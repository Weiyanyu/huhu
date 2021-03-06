package top.yeonon.huhumailservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.yeonon.huhucommon.exception.HuhuException;
import top.yeonon.huhumailservice.constants.MailType;
import top.yeonon.huhumailservice.service.IMailService;
import top.yeonon.huhumailservice.vo.TemplateMessageRequestVo;

import javax.mail.MessagingException;

/**
 * @Author yeonon
 * @date 2019/4/17 0017 20:23
 **/
@RestController
@RequestMapping("/mail")
public class MailController {


    @Value("${spring.mail.username}")
    private String from;

    private final IMailService mailService;

    @Autowired
    public MailController(IMailService mailService) {
        this.mailService = mailService;
    }

    @PostMapping("/send/forget_password")
    public void forgetPassword(@RequestBody TemplateMessageRequestVo request) throws MessagingException, HuhuException {
        request.setFrom(from);
        request.setSubject(MailType.FORGET_PASSWORD.getSubject());
        mailService.sendHtmlMail(request, MailType.FORGET_PASSWORD.getTemplateName());
    }

    @PostMapping("/send/question/new_answer_alert")
    public void newAnswerAlert(@RequestBody TemplateMessageRequestVo request) throws MessagingException, HuhuException {
        request.setFrom(from);
        request.setSubject(MailType.NEW_ANSWER_ALERT.getSubject());
        mailService.sendHtmlMail(request, MailType.NEW_ANSWER_ALERT.getTemplateName());
    }
}
