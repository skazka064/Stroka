public class Stroka {
    public static void main(String[] args) {
        String string = "Мама мама мыла раму раму";
        String word[] =  string.split(" ");
        int k;
                for (int i = 0; i < word.length; ++i ){
            k=0;
            for (int j= i+1; j<word.length-1;++j){

                if (word[i]==word[j]) ++k;
                if (k==0) System.out.println(word[i]);

            }
        }

    }
}