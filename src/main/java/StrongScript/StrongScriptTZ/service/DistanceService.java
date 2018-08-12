package StrongScript.StrongScriptTZ.service;

import org.springframework.stereotype.Service;

import static java.lang.StrictMath.acos;
import static java.lang.StrictMath.cos;
import static java.lang.StrictMath.sin;

@Service
public class DistanceService {
    public double calculateDistance(double lat1, double long1, double lat2, double long2){
        double d2r = Math.PI / 180;
        double ph1 = (90.0 - lat1) * d2r;
        double ph2 = (90.0 - lat2) * d2r;

        double thet1 = long1 * d2r;
        double thet2 = long2 * d2r;
        double carc = (sin(ph1) * sin(ph2) * cos(thet1 - thet2) + cos(ph1) * cos(ph2));
        double result = acos(carc) * 6000;
        return result;
    }
}
