package ru.mirea.practice27;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
class Map{
    String[] keys;
    String[] values;
    public HashMap<String,String> createMap(String[] keys,String[] values){
        if(keys.length != values.length) return null;
        this.keys = keys;
        this.values = values;
        HashMap<String,String> hashMap = new HashMap<>();
        for(int i = 0;i<keys.length;i++) hashMap.put(keys[i],values[i]);
        return hashMap;
    }
    public int getSameFirstNameCount(){
        int count = 0;
        for(int i = 0;i<values.length - 1;i++){
            String firstName = values[i];
            for(int j = i + 1;j< values.length;j++){
                if(firstName.equals(values[j])){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    public int getSameLastNameCount(){
        int count = 0;
        for(int i = 0;i<keys.length - 1;i++){
            String lastName = keys[i];
            for(int j = i + 1;j< keys.length;j++){
                if(lastName.equals(keys[j])){
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public void print(){
        System.out.println('{');
        for(int i = 0;i< keys.length;i++){
            System.out.println(keys[i] + '=' + values[i] + ',');
        }
        System.out.println('}');
    }
}

class Main {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>(List.of(10, 5, 3, 2, 1, 9, 6, 54, 2, 0));
        System.out.println(hashSet);
        TreeSet<Integer> treeSet = new TreeSet<>(hashSet.stream().toList());
        System.out.println(treeSet);

        Map map = new Map();
        String[] firstNames = new String[10];
        String[] lastNames = new String[10];
        for(int i = 0;i<10;i++){
            firstNames[i] = "FirstName" + i % 5;
            lastNames[i] = "LastName" + i % 4;
        }
        HashMap hashMap = map.createMap(lastNames,firstNames);
        map.print();
        System.out.println("getSameFirstNameCount - " + map.getSameFirstNameCount());
        System.out.println("getSameLastNameCount - " + map.getSameLastNameCount());
    }
}
