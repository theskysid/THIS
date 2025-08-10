package com.theskysid.student;

import com.theskysid.student.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class StudentService {

   @Autowired
   StudentRepository studentRepository;

   public Student SaveStudent(Student student) {
      studentRepository.save(student);
      return student;
   }

}
