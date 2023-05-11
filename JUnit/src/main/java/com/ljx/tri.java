package com.ljx;

public class tri {
    public int a,b,c;
    public tri(int a, int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public tri() {
        a=0;
        b=0;
        c=0;
    }

    public String judgement(){
        if( a+b<=c || a+c<=b || b+c <=a){
            return "Not a triangle";
        }else{
            if(a==b&&a==c){
                return "equilateral";
            }else if(a == c && b != c){
                return "isosceles";
            }else{
                return "scalene";
            }
        }
    }

}

