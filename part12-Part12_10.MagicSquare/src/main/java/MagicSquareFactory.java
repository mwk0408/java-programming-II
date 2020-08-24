
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);
        int y=0;
        int x=(size-1)/2;
        int rec=1;
        int temp1;
        int temp2;
        while (rec<size*size+1) {    
            square.placeValue(x, y, rec);
            temp1=y;
            temp2=x;
            y--;
            x++;
            if (y<0) {
                y=size-1;
            }
            if (x==size) {
                x=0;
            }
            if (square.readValue(x, y)!=0) {
                y=temp1+1;
                x=temp2;
                if (y>=size) {
                    y=0;
                }
            }
            rec++;
        }
        // implement the creation of a magic square with the Siamese method algorithm here
        return square;
    }
}
