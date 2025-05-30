package com.example.springsession.demo;

import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//@Slf4j
@Controller
public class DemoController {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(DemoController.class);


    private final Counter counterBean;

    @Value("NODE-XXXXX")
    private String nodeName;

    public DemoController(Counter counterBean) {
        this.counterBean = counterBean;
    }


    @GetMapping("/")
    public String demo(HttpSession session, Model m) {
        log.info("[m:demo] Running in node: {}", nodeName);

        // Atributo de sesión
        Integer counter = (Integer) session.getAttribute("counter");
        if (counter == null) {
            counter = 0;
        }
        counter++;
        session.setAttribute("counter", counter);
        m.addAttribute("counter", counter);

        // Bean con session scope
        m.addAttribute("counterValue", this.counterBean.incrAndGet());

        // Configuración
        m.addAttribute("nodeName", this.nodeName);

        // 👇 Aquí se pasa el ID de la sesión como atributo normal
        m.addAttribute("sessionId", session.getId());
        log.info("Session ID: {}", session.getId());


        return "demo";
    }

}
