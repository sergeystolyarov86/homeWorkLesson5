package com.company;

public class Worker {
    String FIO;
    String rang;
    String email;
    int phoneNumber;
    int salary;
    int age;
    Worker(String FIO,String rang,String email,int phoneNumber,int salary,int age) {
        this.FIO = FIO;
        this.rang = rang;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
        void infoWorker() {
            System.out.println("Имя,Фамилия,Отчество: " + this.FIO);
            System.out.println("Должность: " + this.rang);
            System.out.println("Адрес электронной почты: " + this.email);
            System.out.println("Номер телефона сотрудника: " + this.phoneNumber);
            System.out.println("Зарплата сотрудника: " + this.salary);
            System.out.println("Возраст сотрудника: " + this.age);

        }

    }


