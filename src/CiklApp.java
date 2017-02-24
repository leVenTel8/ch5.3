class CiklApp {

    public static void main(String[] args){

        CiklList theList = new CiklList();

        theList.insert(7);
        theList.insert(9);
        theList.insert(10);
        theList.insert(22);
        theList.display();

        theList.delete();
        theList.display();
        theList.delete();
        theList.find(7);
        theList.display();


    }

}
