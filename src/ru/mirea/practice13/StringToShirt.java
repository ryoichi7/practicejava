package ru.mirea.practice13;

class Shirt {
    private String size;
    private String code;
    private String name;
    private String color;

    public Shirt(String str) {
        String[] splitStr = str.split(",");
        this.code = splitStr[0];
        this.name = splitStr[1];
        this.color = splitStr[2];
        this.size = splitStr[3];
    }

    public String toString() {
        return code + ", " + name + ", " + color + ", " + size;
    }

    public static void main(String[] args) {
        String[] shirts = {
                "S001,Black Polo Shirt,Black,XL",
                "S002,Black Polo Shirt,Black,L",
                "S003,Blue PoloShirt,Blue,XL",
                "S004,Blue Polo Shirt,Blue,M",
                "S005,Tan PoloShirt,Tan,XL" };

        Shirt[] Shirts = new Shirt[5];
        for (int i = 0; i < 5; ++i){
            Shirts[i] = new Shirt(shirts[i]);
            System.out.println(Shirts[i]);
        }

    }
}

