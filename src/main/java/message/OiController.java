package message;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class OiController {

    private static final String template = "Mensagem, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/oi")
    public Oi oi(@RequestParam(value="name", defaultValue="Amigo!") String name) {
        return new Oi(counter.incrementAndGet(),
                String.format(template, name));
    }

}
