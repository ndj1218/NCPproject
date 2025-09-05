package com.smhrd.web.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cloudtest {
	
	@Id
	private Long id;  // int로 잡아도 되나 더 긴 자료형으로 잡기 위해 long으로 잡았음
	private String name;
	private String gender;
	private int age;
	
}
