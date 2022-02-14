import java.util.ArrayList;

public class Forest {

    private ArrayList<Tree> trees ;
    
    private Tree tree;


    public Forest() {

        

        trees = new ArrayList<>();

    }

    public void addTree(int growthPct){

        Tree sapling = new Tree(growthPct);

        trees.add(sapling);

    }

    public String toString(){

        String text = ("Forest(");

        String text1 = "";

        Tree element = trees.get(0);

        for (int i = 0; i < trees.size(); i++) {
            element = trees.get(i);
            text1 = element.toString();
            text = (text + text1);
            //System.out.println(trees.size());
            //System.out.println(text);
            }   
        text = (text + ")");
        return text;
        
    }

    public void growOneYear(){

        Tree element = trees.get(0);

        for (int i = 0; i < trees.size(); i++) {
            element = trees.get(i);
            element.growOneYear();
        }


    }

    
}


