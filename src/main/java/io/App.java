package io;

import services.SneakerService;

public class App {

        public static void main(String... args){
            SneakerService sneakerService = new SneakerService(); // (1)
                App application = new App(); // (2)
                application.init();//(3)
            }

            public void init() {
                // (4)
                // application logic here
                // call methods to take user input and interface with services
                Console.printWelcome();
            }

    }




