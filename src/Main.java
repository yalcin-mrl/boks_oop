public class Main {
    public static void main(String[] args){
        Fighter f1 = new Fighter("Muhammed Ali",10,140,120,30);
        Fighter f2 = new Fighter("Mike Tyson",15,110,95,40);
        Match match = new Match(f1,f2,85,130);
        match.run();
    }
}
