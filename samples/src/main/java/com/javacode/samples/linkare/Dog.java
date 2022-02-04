package com.javacode.samples.linkare;

public class Dog {
    private float height;
    private float weight;
    private String race;
    private String name;

    public float getHeight(){ return this.height;}
    public float getWeight(){ return this.weight;}
    public String getRace(){return this.race;}
    public String getName(){return  this.name;}

    public void setHeight(float height) {
        this.height = height;
    }
    public void setWeight(float weight){
        this.weight = weight;
    }
    public void setRace(String race){
        this.race = race;
    }
    public void setName(String name){
        this.name = name;
    }

    public Dog(){

    }

    public Boolean Equals(Dog comparedDog){
        return comparedDog.getRace().equals(this.getRace())
                && comparedDog.getName().equals(this.getName());
    }
}
