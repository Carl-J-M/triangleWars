package Items;

public abstract class Item {
    private Item item;
    private int weight, value;

        public Item(int weight, int value){
            this.weight = weight;
            this.value = value;
        }

        public int getWeight(){
            return this.weight;
        }
        public int getValue(){
            return this.value;
        }
}
