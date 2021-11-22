package com.xworkz.dp.dto;

public class MovieDTO {

	private String movieName;
	private String directorName;
	private String actorName;
	private String producerName;
	private Integer rating;

	public MovieDTO() {
		System.out.println("Invoked no-arg Constructor");
	}

	public MovieDTO(String movieName, String directorName, String actorName, String producerName, Integer rating) {
		super();
		this.movieName = movieName;
		this.directorName = directorName;
		this.actorName = actorName;
		this.producerName = producerName;
		this.rating = rating;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	public String getProducerName() {
		return producerName;
	}

	public void setProducerName(String producerName) {
		this.producerName = producerName;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}
}
