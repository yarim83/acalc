package pl.gov.sw.acalc.basic;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1")
public class BasicCalcController {

    private final BasicCalcService basicCalcService;

    @PostMapping(value = "/add")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public Result add(@RequestBody Operation operation) {
        var sum = basicCalcService.add(operation.getAddend1(), operation.getAddend2());
        return new Result(sum);
    }

    @PostMapping(value = "/substract")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public Result sub(@RequestBody Operation operation){
        var sub = basicCalcService.subtract(operation.getAddend1(), operation.getAddend2());
        return new Result(sub);
    }
}
