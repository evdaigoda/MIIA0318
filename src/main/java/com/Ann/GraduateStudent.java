package com.Ann;

public class GraduateStudent extends Student{
        int thesis;
        public GraduateStudent(String name, int english, int math, int thesis) {
            super(name,english,math);
            this.thesis = thesis;
        }
    }

