package hangout;


    class Dog{
        String breed,name,color;

        void bark(){
            System.out.println(name+" can "+"bark");
        }
        void play(){
            System.out.println(name+" can "+"play");
        }
        void run(){
            System.out.println(name+" can "+"run");
        }
        public static void main(String[] args){
            Dog dog1=new Dog();
            dog1.name="Husky";

            Dog dog2=new Dog();
            dog2.name="Bulldog";

            Dog dog3=new Dog();
            dog3.name="Labrador";

            dog1.bark();
            dog1.run();
            dog1.play();
            dog2.bark();
            dog2.run();
            dog2.play();
            dog3.bark();
            dog3.run();
            dog3.play();

        }



    }

