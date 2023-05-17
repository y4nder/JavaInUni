public class ImageCreator {
    public static void main(String[] args){
        int num = 0;
        while(num < 64){            
            for(int i = 0; i < 8; i++){
                for(int j = 0; j < 64; j++){
                    System.out.print(num);
                }
                System.out.println("");
            }
            num += 8;
        }
    }
}
