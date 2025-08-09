package com.theskysid.dateandtime.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "dateandtime")
public class DateAndTime {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;

   @JsonFormat(pattern = "dd-MM-yyyy") //this annotation is used to change the default format to custom format
   private LocalDate localDate;  //input format is yyyy-mm-dd

   private LocalTime localTime; //input format is HH:mm:ss:mili_second

   private LocalDateTime localDateTime; //input format is "yyyy-MM-ddTHH:mm:ss.NNNNNN" T is separater for date and time

   private OffsetDateTime offsetDateTime;//input format is "yyyy-MM-ddTHH:mm:ss.NNNNNN+05:30 "

   private ZonedDateTime zonedDateTime; //input format is "yyyy-MM-ddTHH:mm:ss.NNNNNN+05:30[Asia/Calcutta]" only registerd zone can be used

   private Date legacyDate;
}
