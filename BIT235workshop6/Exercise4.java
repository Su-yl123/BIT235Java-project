public class Exercise4 {
    public static void main(String[] args) {
        String coded = "G tgsl Qefe.";
        char[] decodeTable = new char[256];

        decodeTable['a']='c';
        decodeTable['b']='r';
        decodeTable['c']='e';
        decodeTable['d']='s';
        decodeTable['e']='f';
        decodeTable['f']='e';
        decodeTable['g']='t';
        decodeTable['G']='I';
        decodeTable['t']='T';
        decodeTable['g']='h';
        decodeTable['s']='i';
        decodeTable['l']='s';
        decodeTable['Q']='W';
        decodeTable['e']='h';

        StringBuilder decoded = new StringBuilder();
        for(int i=0; i<coded.length();i++){
            char ch = coded.charAt(i);
            if(decodeTable[ch] != 0){
                decoded.append(decodeTable[ch]);
            }else{
                decoded.append(ch);
            }
        }
        System.out.println(decoded.toString());
    }
}
