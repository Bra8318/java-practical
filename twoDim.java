package P1;
    public class twoDim{
        private int x;
        private int y;
    
        public twoDim(){
        
        }
        public twoDim(int x,int y){
            this.x = x;
            this.y = y;
        }
        public int getx(){
            return x;
        }
        public int gety(){
            return y;
        }
    
        public String toString(){
                return ("twoDim coordinates:" + getx() + ","+ gety());
            }
       
        }
    
    
     

