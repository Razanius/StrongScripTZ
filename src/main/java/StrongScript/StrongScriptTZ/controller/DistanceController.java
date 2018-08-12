package StrongScript.StrongScriptTZ.controller;

import StrongScript.StrongScriptTZ.service.DistanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/distance")
@ResponseBody
public class DistanceController {

    @Autowired
    private DistanceService distanceService;

    @GetMapping
    @ResponseBody
    public String calculate(@RequestParam double lat1, @RequestParam double long1, @RequestParam double lat2, @RequestParam double long2){
        double result =  distanceService.calculateDistance(lat1, long1, lat2, long2);
        String a = "Distance is " + result;
        return a;

    }
}
