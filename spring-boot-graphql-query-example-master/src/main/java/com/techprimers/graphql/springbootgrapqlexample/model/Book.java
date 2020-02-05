package com.techprimers.graphql.springbootgrapqlexample.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
public class Book {

    public Book(long string, String string2, String string3, String[] strings, String string4) {
		// TODO Auto-generated constructor stub
	}
    public Book() {
        
    	}
    @Id
    @Column(name="isn")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long isn;
    private String title;
    private String publisher;
    private String[] authors;
    private String publishedDate;
}
