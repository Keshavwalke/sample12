package org.example;

public class Demo {




    public   int fun(){
        return 10;
    }




    public static int solve(String s){
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(s.indexOf(c)==s.lastIndexOf(c)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

      Original obj= new Original() {
          public void show() {
              System.out.println("this is from annonyms class.");
          }
      };
      obj.show();
      }

}
