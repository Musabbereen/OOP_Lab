import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.UpperCase;

public class NumWordPrinter {

        public String printWord(int n,boolean Upr_or_lwr){
                if(n%2==0 && n%13==0 && n%11==0){
                        String res="EvenPrimeLucky";
                         res =  tru_or_fal(Upr_or_lwr,res);
                        return res;
                }

                else  if(n%2==0 && n%11==0){
                        String res="EvenPrimeEleven";
                        res =  tru_or_fal(Upr_or_lwr,res);
                        return res;
                }
                else if(n%2==0){
                        String res="Even";
                        res =  tru_or_fal(Upr_or_lwr,res);
                        return res;
                }
                else if(n%2==11){
                        String res="EvenPrimeEleven";
                        res =  tru_or_fal(Upr_or_lwr,res);
                        return res;
                }
                else if(n%13==0){
                        String res="LuckyThirteen";
                        res =  tru_or_fal(Upr_or_lwr,res);
                        return res;
                }
                else{
                        String res="OddOneOut";
                        res =  tru_or_fal(Upr_or_lwr,res);
                        return res;
                }

        }
        public String tru_or_fal(boolean val,String res){
                if(val==true){
                        return res.toUpperCase();
                }
                else{
                        return res.toLowerCase();
                }

        }
}
