package software.bytepushsers.acshackathon.controller;


import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import software.bytepushsers.acshackathon.domain.AmbulanceLocation;

@Controller
public class AmbulanceLocationController {

    @RequestMapping(path = "/ambulances",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    AmbulanceLocation saveLocation(@RequestBody AmbulanceLocation ambulanceLocation) {
        return new AmbulanceLocation(ambulanceLocation.getAmbulanceId(), ambulanceLocation.getLongitude(), ambulanceLocation.getLatitude());
    }

    @RequestMapping(path = "/ambulances/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    AmbulanceLocation getLocation(@PathVariable("id") Integer id) {
        return new AmbulanceLocation(1, 100.00, -300.00);
    }
}
