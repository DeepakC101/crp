package com.aber.crp.dto;

import java.util.Set;

import com.aber.crp.model.Tag;

public class PostDto extends BaseEntityDto {
	
	private Long id;
	private String subject;
	private String description;
	private String codeSample;
	private String codeSampleWithIndex;
	private boolean reviewed = false;
	private boolean goodPractice = false;
	private Set<Tag> tags;

	
	public String getSubject() {
		if (subject!= null && subject.length() > 10) {
			return subject.substring(0, 10) + "....";
		}
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDescription() {
                    if (description!= null && description.length() > 50) {
			return description.substring(0, 50) + "....";
		}
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCodeSample() {
		return codeSample;
	}
	public void setCodeSample(String codeSample) {
		this.codeSample = codeSample;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodeSampleWithIndex() {
		return codeSampleWithIndex;
	}
	public void setCodeSampleWithIndex(String codeSampleWithIndex) {
		this.codeSampleWithIndex = codeSampleWithIndex;
	}
	public boolean isReviewed() {
		return reviewed;
	}
	public void setReviewed(boolean reviewed) {
		this.reviewed = reviewed;
	}
	public boolean isGoodPractice() {
		return goodPractice;
	}
	public void setGoodPractice(boolean goodPractice) {
		this.goodPractice = goodPractice;
	}
	public Set<Tag> getTags() {
		return tags;
	}
	public void setTags(Set<Tag> tags) {
		this.tags = tags;
	}
	
	
	
	
}
