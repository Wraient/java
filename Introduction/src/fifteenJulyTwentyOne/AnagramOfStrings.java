package fifteenJulyTwentyOne;

public class AnagramOfStrings{
    public static void main(String[] args){
        String s = "aaa";
        String l = "aba";
        boolean visited[] = new boolean[s.length()];
        if(s.length()==l.length()){
            boolean soFar = true;
            for(int i=0; i<s.length(); i++){
                if(soFar==true){
                    soFar = false;
                        for(int j=0; j<s.length(); j++){
                            if(l.charAt(j)==s.charAt(i) && !visited[j]){
                                visited[j] = true;
                                soFar = true;
                                break;
                            }
                        }
                }
                else{System.out.println("These ain't");
                    break;
                }
                if(i==s.length()-1){
                System.out.println("These are anagrams!");
                }
            }
        }
        else{
            System.out.println("These ain't anagrams!");
        }
    }
}