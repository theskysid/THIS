package com.theskysid.dateandtime.Service;

import com.theskysid.dateandtime.Entity.DateAndTime;
import com.theskysid.dateandtime.Repository.DateAndTimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class DateAndTimeService {

   @Autowired
   DateAndTimeRepository  dateAndTimeRepository;

   public ResponseEntity<?> saveDate(DateAndTime dateAndTime) {
      dateAndTimeRepository.save(dateAndTime);

      return ResponseEntity.ok().build();
   }
}
