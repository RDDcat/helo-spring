package first.helospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model){
            model.addAttribute("data", "hello!!");
            return "hello";
    }

    @GetMapping("hello-mvc")
    public String hellomvc(@RequestParam(value="name", required = false) String name, Model model ){
        model.addAttribute("name", name);
        return "hello-template";
    }

    @GetMapping("hello-string")
    @ResponseBody // 응답 바디에 직접 넣어주겠다
    public String helloString(@RequestParam("name") String name){
        return "hello " + name; // hello spring
    }

    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name, @RequestParam("id") String id){
        Hello hello = new Hello();
        hello.setName(name);
        hello.setId(id);
        return hello;
    }

    static class Hello {
        private String name;
        private String id;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }
}
