package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "course_detail")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    int courseId;

    @Column(length = 20, nullable = false)
    String title;

    @Column
    int duration;

    @Column
    double price;

    public Course() {
    }

    public Course(String title, int duration, double price) {
        this.title = title;
        this.duration = duration;
        this.price = price;
    }

    public Course(int courseId, String title, int duration, double price) {
        this.courseId = courseId;
        this.title = title;
        this.duration = duration;
        this.price = price;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", title='" + title + '\'' +
                ", duration=" + duration +
                ", price=" + price +
                '}';
    }
}
