package com.LABS.lab6;

class Person {
    String title;
    String givenName;
    String middleName;
    String familyName;
    String name;
    String birthDate;
    String gender;
    String homeAddress;
    String Phone;
}

class Hospital {
    String id;
    String address;
    String phone;
}

class Patient extends Person {
    String name;
    String birthDate;
    String gender;
    String id;
    Integer age;
    String accepted;
    String sickness;
    String prescriptions;
    String allergies;
    String specialReqs;
}

class Department {}

class Staff {
    String joined;
    String education;
    String certification;
    String languages;
}

class OperationsStaff extends Staff {}

class AdministrativeStaff extends Staff {}

class TechnicalStaff extends Staff {}

class Doctor extends OperationsStaff {
    String speciality;
    String locations;
}

class Nurse extends OperationsStaff {}

class Surgeon extends Doctor {}

class FrontDeskStaff extends AdministrativeStaff {}

class Receptionist extends FrontDeskStaff {}

class Technician extends TechnicalStaff {}

class Technologist extends TechnicalStaff {}

class SurgicalTechnologist extends Technologist {}