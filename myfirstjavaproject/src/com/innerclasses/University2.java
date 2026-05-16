package com.innerclasses;

interface Role {
    void performDuties();
}

public class University2 {
    public static void main(String[] args) {
        
    	Role hod = new Role() {
            public void performDuties() {
                System.out.println("Head of Department manages faculty and curriculum.");
            }
        };

        hod.performDuties();
    }
}

