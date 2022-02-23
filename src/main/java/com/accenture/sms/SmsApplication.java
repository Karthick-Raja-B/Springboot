package com.accenture.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.accenture.sms.entity.Student;
import com.accenture.sms.repository.StudentRepository;

@SpringBootApplication
public class SmsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SmsApplication.class, args);
	}
@Autowired
private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		
//		Student student1=new Student("Karthick Raja","Balasundaram","karthickbalu8991@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2=new Student("Preethika","Balasundaram","preethikarthi95@gmail.com");
//		studentRepository.save(student2);
//		
//		Student student3=new Student("Radhika","Balasundaram","radhikabalu73@gmail.com");
//		studentRepository.save(student3);
//		
//		Student student4=new Student("Balasundaram","Periyasamy","balanbalu63@gmail.com");
//		studentRepository.save(student4);
	}

}
