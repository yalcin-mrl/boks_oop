import java.util.Random;

public class Match {
    Random rand = new Random();
    Fighter f1,f2;
    int minWeight,maxWeight;
    Match(Fighter f1,Fighter f2,int minWeight,int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;

    }
    public void run(){
        if(isChecked()){

            int i = 1;
            while(this.f1.health >0 && this.f2.health>0){
                System.out.println("===== "+ i +" Round =====");
                int rand_vurus = rand.nextInt(2);
                if(rand_vurus==0){
                    i++;
                    this.f2.health = this.f1.hit(this.f2);
                    System.out.println(this.f2.health);
                    if(isWin()){
                        break;
                    }
                    this.f1.health = this.f2.hit(this.f1);
                    System.out.println(this.f1.health);
                    if(isWin()){
                        break;
                    }
                    System.out.println(this.f1.name + " sağlık : " + this.f1.health);
                    System.out.println(this.f2.name + " sağlık : " + this.f2.health);
                }else{
                    i++;
                    this.f1.health = this.f2.hit(this.f1);
                    System.out.println(this.f1.health);
                    if(isWin()){
                        break;
                    }
                    this.f2.health = this.f1.hit(this.f2);
                    System.out.println(this.f2.health);
                    if(isWin()){
                        break;
                    }
                    System.out.println(this.f1.name + " sağlık : " + this.f1.health);
                    System.out.println(this.f2.name + " sağlık : " + this.f2.health);
                }
            }
        }
        else
        {
            System.out.println("Sporcuların sikletleri uymuyor");
        }
    }
    boolean isChecked(){
        return (this.f1.weight >= minWeight && this.f1.weight<=maxWeight) && (this.f2.weight>=minWeight && this.f2.weight<=maxWeight);
    }
    boolean isWin(){
        if(this.f1.health == 0){
            System.out.println(f2.name + " Kazandı");
            return true;
        }
        if(this.f2.health == 0){
            System.out.println(f1.name + " Kazandı");
            return true;
        }
        return false;
    }
}
