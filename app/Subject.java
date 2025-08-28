import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "subjects")
public class Subject {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String name;
    private String instructor;
    private String contact;
    private String schedule;

    public Subject(String name, String instructor, String contact, String schedule) {
        this.name = name;
        this.instructor = instructor;
        this.contact = contact;
        this.schedule = schedule;
    }

    public void setId(int id) { this.id = id; }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getInstructor() { return instructor; }
    public String getContact() { return contact; }
    public String getSchedule() { return schedule; }
}
