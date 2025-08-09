package com.theskysid.dateandtime.Controller;

import com.theskysid.dateandtime.Entity.DateAndTime;
import com.theskysid.dateandtime.Service.DateAndTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/x")
public class DateAndTimeController {

   @Autowired
   DateAndTimeService dateAndTimeService;

   @PostMapping("/createdateandtime")
   public ResponseEntity<?> saveDateAndTime(@RequestBody DateAndTime dateAndTime){
      return dateAndTimeService.saveDate(dateAndTime);
   }
}
