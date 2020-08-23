public class User implements Comparable<User>{

    private int points;

    public User(int points){
        this.points = points;
    }


    @Override
    public int compareTo(User o) {
        return points - o.points; 
    }
}
