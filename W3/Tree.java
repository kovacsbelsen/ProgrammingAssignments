public class Tree{

    private int age;
    private double height;
    private double growthPct;

    public Tree(double growthPct) {
        this.height = 0.25;
        this.age = 1;
        this.growthPct = growthPct;
        }

    public String toString() {
        String text = ( "Tree(age = " + this.age +", height = " + this.height +")");
        return text;
        }

    public void growOneYear() {

        this.age = this.age + 1;

        if (this.height < 20){
            if ((this.height * (1 + this.growthPct / 100) < 20))           
            this.height = this.height * (1 + this.growthPct / 100);

            else if ((this.height * (1 + this.growthPct / 100) >= 20))
            this.height = 20;

        }


        else if (this.height >= 20)
            this.height = 20;
        
        }

}
