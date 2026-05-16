package com.innerclasses;

public class University {
    private static String universityName = "VCUBE University";

    // Static Nested Class
    public static class Department {
        private String departmentName;

        public Department(String departmentName) {
            this.departmentName = departmentName;
        }

        public void showDetails() {
            System.out.println("University: " + universityName + ", Department: " + departmentName);
        }
    }

    public static void main(String[] args) {
        University.Department dept = new University.Department("JAVA");
        dept.showDetails();
    }
}

