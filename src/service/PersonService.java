package service;

import java.util.ArrayList;
import java.util.List;




// RECEBE UM TIPO GENERICO
public class PersonService<T>{
    

// LISTA VAI RECEBER UM TIPO GENERICO
private   List<T> list = new ArrayList<>();

public List<T> getList() {
    return list;
}


    // PARAMETRIZANDO COM UM TIPO GENERICO QUE 
public void  add(T value){

    list.add(value);
}

// RETORNA UM DETERMINANDO TIPO GENERICO
public void first(){
   
    System.out.println(list.get(0));
}




}
