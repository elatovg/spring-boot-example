package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/** GreetingController example. */
@RestController
public class GreetingController {

  private static final String TEMPLATE = "Hello, %s! You are visitor number %s, env is set to %s";
  private final AtomicLong counter = new AtomicLong();

  @Value("${our.env}")
  String value;

  @RequestMapping("/")
  public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
    return String.format(TEMPLATE, name, counter.incrementAndGet(),value);
  }

}
