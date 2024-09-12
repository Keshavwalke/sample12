package org.example;

public class Sample3 {
    //find the first occurence of word in another word

    public static int findFirstOccurence(String sentence, String anotherWord){

        int SLen=sentence.length();
        int WLen=anotherWord.length();

        for(int i=0;i<SLen-WLen+1;i++){
            int k=i;
            int count=0;
            for(int j=0;j<WLen;j++){
                if(sentence.charAt(k)!=anotherWord.charAt(j)){
                    break;
                }
                else {
                    count++;
                    k++;
                }
            }
            if(count==WLen){
                return i;
            }
        }

        return -1;
    }


    public static String solve(String input){
        int N=input.length();
        int val=-1;
        boolean flag=false;
        StringBuilder sb=new StringBuilder();
        int digit=0;

        for(int i=0;i<N;i++){
            if(Character.isDigit(input.charAt(i))){
                flag=true;
                val=Integer.parseInt(String.valueOf(input.charAt(i)));
            }
            else{
                if(input.charAt(i)=='['  || input.charAt(i)==']'){
                    i++;
                }
                else if(flag==true && val!=-1 && input.charAt(i)!='['  && input.charAt(i)!=']'){
                    for(int k=0;k<val;k++){
                        sb.append(input.charAt(i));
                    }
                }
                else{
                    sb.append(input.charAt(i));
                    val=-1;
                    flag=false;
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String sentence="is sample";
        String anotherWord="sample";

        System.out.println(findFirstOccurence(sentence,anotherWord));


        String one= "aki[2ek][3c]d";

        System.out.println(solve(one));
    }
}
