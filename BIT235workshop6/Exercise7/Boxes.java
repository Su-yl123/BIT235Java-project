package Exercise7;

public class Boxes {
    private int size;

    public Boxes(int size){
        if(size>10) size =10;
        this.size = size;
    }

    public void setSize(int size){
        if(size>10) size =10;
        this.size = size;
    }

    @Override
    public String toString(){
        return size + " x " + size;
    }

    public void draw(){
        char horizontal = '-';
        char vertical = '|';
        for(int row=0; row<size; row++){
            for(int col=0; col<size; col++){
                if(row ==0 || row == size-1){
                    System.out.print(horizontal);
                }else{
                    if(col ==0 || col == size-1){
                        System.out.print(vertical);
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
