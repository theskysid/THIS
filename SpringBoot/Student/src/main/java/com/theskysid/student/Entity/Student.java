package com.theskysid.student.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class Student {

   @Id
   @GeneratedValue(strategy = GenerationType.UUID)
   private UUID id; //Universally Unique Identifier is a 128-bit number which is used to uniquely identify the information in the computer system. it is formatted as 8-4-4-4-12 characters
   private String name;
   private String email;
}
