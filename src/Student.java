public class Student {
    private String name;
    private String id;
    private int score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score<0||score>100){
            return;
        }
        else
        this.score = score;
    }

    public Student(String name, String id, int score) {
        this.name = name;
        this.id = id;
        if (score<0||score>100){
            this.score=0;
        }
        else
            this.score = score;
    }

    @Override
    public String toString() {
        return
                "name=" + name  +
                ",id=" + id +
                ",score=" + score;
    }

    public static void main(String[] args) {
        Student student=new Student("wang","123",50);
        System.out.println(student);
    }
}
