package quintor.bioinf.nl.quintorcatalogbackend.webcontrol;

import java.util.ArrayList; // Add missing import statement
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/hello")
public class HelloRest {

    @GetMapping("/rest")
    public List<String> getHello(@RequestParam(value="name") String name) {
        List<String> myNewList = new ArrayList<>(); 
        myNewList.add("Added Name via Request: " + name);
        return myNewList;
    }
}
