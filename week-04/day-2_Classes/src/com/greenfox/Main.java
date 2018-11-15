package com.greenfox;

public class Main {

    public static void main(String[] args) {
//1. PostIt
        //Constructor values:  String backgroundColor, String textOnIt, String textColor
        /*Create a few example post-it objects:
        an orange with blue text: "Idea 1"
        a pink with black text: "Awesome"
        a yellow with green text: "Superb!*/
        PostIt postIt1 = new PostIt("orange","Idea 1", "blue");
        PostIt postIt2 = new PostIt("pink", "Awesome","black");
        PostIt postIt3 = new PostIt("yellow", "Superb","green");
        PostIt postIt4 = new PostIt();

        System.out.println(postIt1.backgroundColor + postIt1.textColor + postIt1.textOnIt);



    }
}
