/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

//Since we get the dep id, user is not fermiliar with numbers. So I used Getters and Settters to get the relavant dep name
public class Department {
    int id;
    String name;
    
    public Department (int _id, String _name){
        id = _id;
        name = _name;
    }
    public int getId(){
    return id;
    }
    public String getName(){
    return name;
    }
    public void  setId(int _id){
    id = _id;
    }
    public void setName(String _name){
    name = _name;
    }
}
