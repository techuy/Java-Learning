class Dog{
    String name;
    public static void main(String[] args) {
        //make a dog object and access it 
        Dog dog1 = new Dog();
        //null
        dog1.bark();
        dog1.name ="Bart";

        //make dog array
        Dog[] myDogs = new Dog[3];
        //put some dogs into the array
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        //now access the Dogs using array
        //references;
        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";

        //What is myDogs[2] name ?
        System.out.print("last dog's name is ");
        System.out.println(myDogs[2].name);

        //loop through the array and tell al dog to bark
        int x=0;
        while(x<myDogs.length){
            myDogs[x].bark();
            x=x+1;
        }
    }
    public void bark(){
        System.out.println(name+ " says Ruff");
    }
}