package stadium;

public class Stadium {
    public static void main(String[] args){
        int capacity = 29000;
        boolean  hasLights = false;
        boolean inCapacity =capacity > 30000;
        System.out.println(inCapacity || hasLights ? "Тhe stadium has a license for A group." : "Sorry the stadium is only for group b matches." );
    }
}
