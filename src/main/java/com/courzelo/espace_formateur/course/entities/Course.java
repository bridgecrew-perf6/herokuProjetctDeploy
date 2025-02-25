package com.courzelo.espace_formateur.course.entities;


import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;

@Document(collection="Course")
@Getter
@Setter
public class Course {
	
	

	@Id
	private String id;
	
	@Field(value = "User")
	private long idUser;
	
	@Field(value = "Title")
    private String title;
	
	@Field(value = "Language")
	private String language;
	
	@Field(value = "Category")
	private String category;  
	
	@Field(value = "Outcomes")
	private List<String> outcomes;
	
	@Field(value = "ShortDescription")
	private String description;
	
	@Field(value = "Details")
	private String details;
	
	@Field(value = "Skills_Required")
	private List<String> skillsRequired;
    
    @Field(value="Introduction")
    private intrConcluExtremCourse introduction;
    
    @Field(value="Sections")
    private List<ExtremCourse> sections;
    
    @Field(value="Customer Sections")
    private List<CustomerExtremCourse> customerSections;
    
    @Field(value="Conclusion")
    private intrConcluExtremCourse conclusion;
    
    @Field(value = "Audience")
	private String audience;
    
    @Field(value = "Pre-Requisites")
	private List<String> preRequisites;
    
    @Field(value = "InstructorInfo")
	private String instructorInfo;
    
    @Field(value = "Image")
	private String courseImage;
    
    @Field(value = "Video")
	private String courseVideo;
    
    @Field(value = "Price")
	private float price;
    
    @Field(value = "Progress")
	private int progress;
    
    @Field(value = "Status")
	private String status;
    
    
    @Field(value = "Global Quizz")
	private String globalQuizzId;
   
    @Field(value = "Required Score")
   	private int score;
}
