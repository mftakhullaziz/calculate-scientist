
import java.util.ArrayList;
import javax.swing.JOptionPane;


/*
 *
 * @author  MiftakhulAziz&YuliantoPambudi
 


Ide Mesin ini :

*  Mesin memeriksa apakah String dapat diterima
*  Jika diterima maka Mesin memisah String
*  Kemudian melakukan kalkulasi

Kalkulasi :

*  Mengambil inisial state, pada saat awal inisial state  =  A
*  Mengambil operator dari listOperators secara iteratif 
*  Mesin menghapus operator yang diambil
*  Mesin akan menyelesaikan operasi sesuai aturan aritmatika (*,/,+,-)
*  Mengulang proses hingga halting state

State
*  Initial State  A
*  Final State D
*/
public class Automata {
    char state='A';         //inisial state
    String string;
    private float hasil=0;
    ArrayList<Operands> listOperands = new ArrayList<>();
    ArrayList<Operators> listOperators = new ArrayList<>();
    
    public Automata(String string){
        this.string=string;
        StateProses();
    }
    void StateProses(){
        //pengecakan apakah string diterima 
        if(StringsAccepted()){
                int first=0,last=0;
                String subString;
                int indexAngka;
                for(int i=0;i<string.length();i++){
                    if(string.charAt(i)=='+'||string.charAt(i)=='='||string.charAt(i)=='-'||string.charAt(i)=='*'||string.charAt(i)=='/'){
                            last=i;
                            subString=string.substring(first, last);
                            addListOperands(new Operands(Float.parseFloat(subString)));
                            addListOperators(new Operators(string.charAt(i)));
                            first=i+1;
                            System.out.println("simpan= "+ subString);
                    }
        }
               JOptionPane.showMessageDialog(null, "String Diterima Mesin");
               /*
                 * proses pemrosesan operators sesuai urutan aritmatika
                 * prosedur untuk melakukan urutan String Aritmatika yang 
                 * diawali *,/,+,- dan String tersebut disimpan pada Array.
                 */
               hasil=listOperands.get(0).getnumber();
               hasil=Mul();
               hasil=Div();
               hasil=Plus();
               hasil=Minus();
               JOptionPane.showMessageDialog(null, hasil);
        }else{
              JOptionPane.showMessageDialog(null, "String Tidak Diterima Mesin");
        }
    }
    
    private float Div(){
        for(int i=0;i<listOperators.size();i++){
            System.out.println(i);
            if(listOperators.get(i).getset()=='/'){
                hasil=bagi(listOperands.get(i).getnumber(),listOperands.get(i+1).getnumber());
                removeListset(i);
                changeListOperands(i, new Operands(hasil));
                removeListOperands(i+1);
                i=-1;
            }
        }   
        return hasil;
    }
    
    private float Mul(){
        for(int i=0;i<listOperators.size();i++){
            System.out.println(i);
            if(listOperators.get(i).getset()=='*'){
                hasil=kali(listOperands.get(i).getnumber(),listOperands.get(i+1).getnumber());
                removeListset(i);
                changeListOperands(i, new Operands(hasil));
                removeListOperands(i+1);
                i=-1;
            }
        }
        return hasil;
    }
    
    private float Plus(){
        for(int i=0;i<listOperators.size();i++){
            System.out.println(i);
            if(listOperators.get(i).getset()=='+'){
                hasil=tambah(listOperands.get(i).getnumber(),listOperands.get(i+1).getnumber());
                removeListset(i);
                changeListOperands(i, new Operands(hasil));
                removeListOperands(i+1);
                i=-1;
            }
        }
        return hasil;
    }
    
    private float Minus(){
        for(int i=0;i<listOperands.size();i++){
            System.out.println(i);
            if(listOperators.get(i).getset()=='-'){
                hasil=kurang(listOperands.get(i).getnumber(),listOperands.get(i+1).getnumber());
                removeListset(i);
                changeListOperands(i, new Operands(hasil));
                removeListOperands(i+1);
                i=-1;
            }
        }
        return hasil; 
    }
  
  
    
    
    /*
        proses aritmatika
    */
    float tambah(float a1, float a2){
        return a1+a2;
    }
    float kurang(float a1, float a2){
        return a1-a2;
    }
    float kali(float a1, float a2){
        return a1*a2;
    }
    float bagi(float a1, float a2){
        return a1/a2;
    }
    
    private void changeListOperands(int i, Operands a){
        listOperands.set(i, a);
    }
    private void addListOperands(Operands a){
        listOperands.add(a);
    }
    private void addListOperators(Operators set){
        listOperators.add(set);
    }
    private void removeListOperands(int a){
        listOperands.remove(a);
    }
    private void removeListset(int a){
        listOperators.remove(a);
    }
    
    /*
       ilakondisi String diterima
       jika pada String karakter tidak sesuai aturan maka
       akan mengembalikan value false, dan akan melakukan
       perpindahan State.
       kemudian apabila menemukan kondisi state D sebagai 
       final maka String Diterima
    */
    boolean StringsAccepted(){
        char[] charString = string.toCharArray();
        for(int i=0; i<charString.length; i++){
            System.out.println(charString[i]);
            if(!CharactersAccepted(charString[i])){
                return false;
            }else{
                StateMove(charString[i]);
            }
        }
        System.out.println(state);
        return state=='D'; 
    }
    
    /*
        prosedur perpindahan State, initial State diawali pada state A
        kemudian final state pada D
    */
    void StateMove(char s){
        switch (state) {
            case 'A':
                if(s>='1' && s<='9'){
                    state= 'B';
                }   break;
            case 'B':
                if(s>='0' && s<='9'){
                    state= 'B';
                }else if(s=='*' || s=='/' || s=='+' || s=='-'){
                    state='C';
                }else if(s=='='){
                    state='D';
                }   break;
            case 'C':
                if(s>='1' && s<='9'){
                    state='B';
                }   break;
            default:
                break;
        }
    }
    
    
    /*
     proses penerimaan Characters jika pada case pilihan menghasilkan true
     maka Characters Diterima
    */   
    boolean CharactersAccepted(char s){
        switch (state) {
            case 'A':
                if(s>='1' && s<'9'){
                    return true;
                }else{
                    System.out.println(s);
                    return false;
                }
            case 'B':
                if(s>='0' && s<='9'){
                    return true;
                }else return s=='*' || s=='/' || s=='+' || s=='-' || s=='=';
            case 'C':
            return s>='1' && s<='9';
            default:
                return false;
        }
    }
}
