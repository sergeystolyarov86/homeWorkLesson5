package com.company;

public abstract class Main {


    public static void main(String[] args) {
        Worker worker1 = new Worker("Иван Иванович Иванов", "Программист", "hakerman@mail.ru",
                8888777, 100000, 35);
        worker1.infoWorker();

    // Задание 4,5
        System.out.println();
        System.out.println("Вывод в консоль сотудников старше 40 лет:");
        System.out.println();
        Worker[] state = new Worker[5];
        state[0] = new Worker("Михаил Петрович Кофе","Кофевар","kofeman@mail.ru",1234567,
        50000,19);
        state[1] = new Worker("Мария Филлиповна Графова","Уборщица","shvabra@mail.ru",6543217,
                13000,45);
        state[2] = new Worker("Петр Петрович Наковальня","Директор","bigboss@mail.ru",7777777,
                250000,47);
        state[3] = new Worker("Елена Васильевна Телефонкина","Секретарша","secret@mail.ru",7546321,
                60000,23);
        state[4] = new Worker("Александр Сергеевич Конь","Администратор","admin@mail.ru",5647123,
                45000,33);
       for(int i=0;i<5;i++){
           if (state[i].age>40){
               state[i].infoWorker();}
           }
        }
    }

