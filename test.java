
//import LetterInventory;

public class test {



    public static void main(String[] args) {
        LetterInventory LetterInventory1 = new LetterInventory("aaaaabbbb");

        LetterInventory LetterInventory2 = new LetterInventory("aabbd");

        LetterInventory AddedInventories = LetterInventory1.add(LetterInventory2);

        LetterInventory SubtractedInventories = LetterInventory1.subtract(LetterInventory2);

       
        System.out.println("String representation of added inventory");
        System.out.println(AddedInventories.toString());

        System.out.println("String representation of subtracted inventory");
        System.out.println(SubtractedInventories.toString());

        System.out.println("Number of _'s");

        AddedInventories.set('d',7);
        System.out.println(AddedInventories.toString());

        System.out.println(AddedInventories.get('d'));

        

        //System.out.println(LetterInventory2.get('b'));

        

    }

}
