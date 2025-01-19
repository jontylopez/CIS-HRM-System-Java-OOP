/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Janith
 */
public class Employee {

    int id;
    String name;

    public Employee(int id1, String name1) {
        id = id1;
        name = name1;
    }
    
    public int getId(){
    return id;
    }
    public String getName(){
    return name;
    }
    public void  setId(int id1){
    id = id1;
    }
    public void setName(String name1){
    name = name1;
    }
}
//Since we get the emp id, user is not fermiliar with numbers. So I used Getters and Settters to get the relavant name