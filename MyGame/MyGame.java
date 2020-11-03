/*
In a gaming application, each warrior is walking using a walking stick. 
Monsters can steal these walking sticks. 
A warrior becomes immobile if he loses the stick. 
A warrior has a name and age. A monster also has a name and age. 
Add the required methods to these classes. 
In addition to the classes you identified above, you should have a separate class ‘MyGame’ that contains the main method.
Inside the main method, create two warrior objects, and a monster object.
Now set the first warrior’s age to the monster’s age.
Now write the code for the monster to steal the walking stick of the second warrior
*/


public class MyGame {
    public static void main(String[] args){
        Warrior war1 = new Warrior("Krishan",20,true);
        Warrior war2 = new Warrior("Devin",21,true);
        Monster mon1 = new Monster("Sandun",23,false);

        mon1.setAge(war1);
        mon1.stealStick(war1);
        war1.status();
        mon1.status();
    }
}

class Warrior{

    String name;
    int age;
    boolean hasStick;

    Warrior(String passingName, int passingAge, boolean stickStatus){
        this.name = passingName;
        this.age = passingAge;
        this.hasStick = stickStatus;
    }

    void status(){
        if(this.hasStick==true){
            System.out.println(this.name + " is walking");
        }
        else{
            System.out.println(this.name + " is immobile");
        }
    }
}

class Monster{

    String name;
    int age;
    boolean hasStick;

    Monster(String passingName, int passingAge, boolean stickStatus){
        this.name = passingName;
        this.age = passingAge;
        this.hasStick = stickStatus;
    }

    void setAge(Warrior war){
        this.age=war.age;
    }

    void stealStick(Warrior war){
        if(war.hasStick==true){
            System.out.println(this.name + " stealed stick from " + war.name);
            war.hasStick = false;
            this.hasStick = true;
        }
        else{
            System.out.println(war.name + " doesn't have stick");
        }
    }
    
    void status(){
        if(this.hasStick==true){
            System.out.println(this.name + " has stick");
        }
        else{
            System.out.println(this.name + " doesn't have stick");
        }
    }
}